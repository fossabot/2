package hos.houns.weatherapp.data

import hos.houns.weatherapp.device.LocationManager
import hos.houns.weatherapp.domain.core.*
import hos.houns.weatherapp.domain.entity.*
import hos.houns.weatherapp.localstore.store.LocalLocationDataStore
import hos.houns.weatherapp.remotestore.WeatherRemoteDataStore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*

class GetWeatherRepository(
    private val locationManager: LocationManager,
    private val localLocationDataStore: LocalLocationDataStore,
    private val weatherRemoteDataStore: WeatherRemoteDataStore
) {
    suspend fun getWeather(
        latitude: Double?, longitude: Double?
    ): Either<Failure, WeatherUiModel> =
        withContext(Dispatchers.IO) {

            if (latitude != null && longitude != null) {
                fetchDataCurrentAndForeCast(
                    CurrentLocation(latitude ?: 0.0, longitude ?: 0.0),
                    true
                )
            } else if (locationManager.isLocationEnabled() && locationManager.hasFinePermissionGranted()) {
                val currentLocation = locationManager.getCurrentLocation()
                localLocationDataStore.saveLastLocation(currentLocation)
                fetchDataCurrentAndForeCast(currentLocation, false)
            } else if (!locationManager.isLocationEnabled()) {
                val lastLocation = localLocationDataStore.getLastLocation()
                //if we never set location in shared preference
                if (lastLocation == CurrentLocation(0.0, 0.0)) {
                    Either.Left(Failure.LocationIsDisabledError)
                }
                //We have once save the user's local storage
                else {
                    fetchDataCurrentAndForeCast(lastLocation, false)
                }
            } else {
                Either.Left(Failure.FineLocationPermissionNotGrantedError)
            }
        }

    private suspend fun fetchDataCurrentAndForeCast(
        currentLocation: CurrentLocation,
        isFavourite: Boolean
    ): Either.Right<WeatherUiModel> {
        return withContext(Dispatchers.IO) {
            val currentWeatherUIModel =
                fetchCurrentWeatherAndMapToUIModel(currentLocation, isFavourite)
            val foreCastWeatherUIModel =
                fetchForeCastWeatherAndMapToUIModel(currentLocation, isFavourite)
            val weather = WeatherUiModel(currentWeatherUIModel, foreCastWeatherUIModel)

            saveToLocal(currentWeatherUIModel, foreCastWeatherUIModel)

            Either.Right(weather)
        }
    }

    private suspend fun saveToLocal(
        currentWeatherUIModel: CurrentWeatherUIModel,
        foreCastWeatherUIModel: List<ForecastWeatherUIModel>
    ) {
        localLocationDataStore.saveCurrentWeather(currentWeatherUIModel)
        localLocationDataStore.saveForecastWeather(foreCastWeatherUIModel)
        localLocationDataStore.saveUpdateDate(
            SimpleDateFormat(
                "EEE MMM d yy 'at' HH:mm:ss",
                Locale.US
            ).format(Date())
        )
    }

    private suspend fun fetchCurrentWeatherAndMapToUIModel(
        currentLocation: CurrentLocation,
        isFavourite: Boolean
    ): CurrentWeatherUIModel {
        return withContext(Dispatchers.IO) {
            when (val currentWeather = weatherRemoteDataStore.currentWeather(currentLocation)) {
                is Either.Left -> if (isFavourite) CurrentWeatherUIModel.EMPTY else localLocationDataStore.getCurrentWeather()
                is Either.Right -> currentWeather.b.toUiModel()
            }
        }
    }

    private suspend fun fetchForeCastWeatherAndMapToUIModel(
        currentLocation: CurrentLocation,
        isFavourite: Boolean
    ): List<ForecastWeatherUIModel> {
        return withContext(Dispatchers.IO) {
            when (val foreCastWeather = weatherRemoteDataStore.forecastWeather(currentLocation)) {
                is Either.Left -> if (isFavourite) listOf(ForecastWeatherUIModel.EMPTY) else localLocationDataStore.getForecastWeather()
                is Either.Right -> foreCastWeather.b?.toUiModel() ?: emptyList()
            }
        }
    }


}