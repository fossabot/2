package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.core.*
import hos.houns.weatherapp.domain.entity.*
import hos.houns.weatherapp.localstore.store.LocalLocationDataStore
import hos.houns.weatherapp.remotestore.WeatherRemoteDataStore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*

class GetWeatherRepository(
    private val localLocationDataStore: LocalLocationDataStore,
    private val weatherRemoteDataStore: WeatherRemoteDataStore
) {
    suspend fun getWeather(
        latitude: Double, longitude: Double, isFavourite: Boolean
    ): Either<Failure, WeatherUiModel> = withContext(Dispatchers.IO) {

            fetchDataCurrentAndForeCast(
                CurrentLocation(latitude , longitude ),
                isFavourite
            )
        }

    private suspend fun fetchDataCurrentAndForeCast(
        currentLocation: CurrentLocation,
        isFavourite: Boolean
    ): Either.Right<WeatherUiModel> {
        return withContext(Dispatchers.IO) {
            if (!isFavourite){
                println("isNotFavourite lastLocation:$currentLocation")
                localLocationDataStore.saveLastLocation(currentLocation)
            }
            val currentWeatherUIModel =
                fetchCurrentWeatherAndMapToUIModel(currentLocation, isFavourite)
            val foreCastWeatherUIModel =
                fetchForeCastWeatherAndMapToUIModel(currentLocation, isFavourite)
            val weather = WeatherUiModel(currentWeatherUIModel, foreCastWeatherUIModel)

            if (!isFavourite) {
                saveToLocal(currentWeatherUIModel, foreCastWeatherUIModel)

            }


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