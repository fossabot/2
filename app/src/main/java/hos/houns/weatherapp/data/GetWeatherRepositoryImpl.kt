package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.core.*
import hos.houns.weatherapp.domain.entity.*
import hos.houns.weatherapp.domain.usecases.GetWeatherRepository
import hos.houns.weatherapp.domain.usecases.LocationManager
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*

class GetWeatherRepositoryImpl(
    private val coroutineDispatchers: CoroutineDispatchers,
    private val locationManager: LocationManager,
    private val localLocationDataStore: LocalLocationDataStore,
    private val weatherRemoteDataStore: WeatherRemoteDataStore,
) : GetWeatherRepository {

    override suspend fun getWeather(
        latitude: Double?,
        longitude: Double?
    ): Either<Failure, WeatherUiModel> =
        withContext(coroutineDispatchers.io) {
            if (latitude != null && longitude != null) {
                fetchData(CurrentLocation(latitude ?: 0.0, longitude ?: 0.0), true)
            } else if (locationManager.isLocationEnabled() && locationManager.hasFinePermissionGranted()) {
                val currentLocation = locationManager.getCurrentLocation()
                localLocationDataStore.saveLastLocation(currentLocation)

                fetchData(currentLocation, false)
            } else if (!locationManager.isLocationEnabled()) {
                val lastLocation = localLocationDataStore.getLastLocation()
                //if we never set location in shared preference
                if (lastLocation == CurrentLocation(0.0, 0.0)) {
                    Either.Left(Failure.LocationIsDisabledError)
                }
                //We have once save the user's local storage
                else {
                    fetchData(lastLocation, false)
                }
            } else {
                Either.Left(Failure.FineLocationPermissionNotGrantedError)
            }
        }

    private suspend fun fetchData(
        currentLocation: CurrentLocation,
        isFavourite: Boolean
    ): Either.Right<WeatherUiModel> {
        return withContext(coroutineDispatchers.io) {
            val currentWeatherUIModel =
                fetchCurrentWeatherAndMapToUIModel(currentLocation, isFavourite)
            val foreCastWeatherUIModel =
                fetchForeCastWeatherAndMapToUIModel(currentLocation, isFavourite)
            val weather = WeatherUiModel(currentWeatherUIModel, foreCastWeatherUIModel)

            localLocationDataStore.saveCurrentWeather(currentWeatherUIModel)
            localLocationDataStore.saveForecastWeather(foreCastWeatherUIModel)
            localLocationDataStore.saveUpdateDate(
                SimpleDateFormat(
                    "EEE MMM d yy 'at' HH:mm:ss",
                    Locale.US
                ).format(Date())
            )

            Either.Right(weather)
        }
    }

    private suspend fun fetchCurrentWeatherAndMapToUIModel(
        currentLocation: CurrentLocation,
        isFavourite: Boolean
    ): CurrentWeatherUIModel {
        return withContext(coroutineDispatchers.io) {
            when (val currentWeather = weatherRemoteDataStore.currentWeather(currentLocation)) {
                is Either.Left -> if (isFavourite) CurrentWeatherUIModel.EMPTY else localLocationDataStore.getCurrentWeather()
                is Either.Right -> CurrentWeatherUIModel(
                    temp = (currentWeather.b?.main?.temp ?: 0.0).toInt(),
                    tempMax = (
                            currentWeather.b?.main?.temp_max ?: 0.0
                            ).toInt(),
                    tempMin = (
                            currentWeather.b?.main?.temp_min ?: 0.0
                            ).toInt(),
                    type = getWeatherTypeById(currentWeather.b?.weather?.first()?.id ?: 0)
                )
            }
        }
    }

    private suspend fun fetchForeCastWeatherAndMapToUIModel(
        currentLocation: CurrentLocation,
        isFavourite: Boolean
    ): List<ForecastWeatherUIModel> {
        return withContext(coroutineDispatchers.io) {
            when (val foreCastWeather = weatherRemoteDataStore.forecastWeather(currentLocation)) {
                is Either.Left -> if (isFavourite) listOf(ForecastWeatherUIModel.EMPTY) else localLocationDataStore.getForecastWeather()
                is Either.Right -> foreCastWeather.b?.daily?.map {
                    ForecastWeatherUIModel(
                        temp = it.temp.max.toInt(),
                        type = getWeatherTypeById(it.weather.first().id),
                        day = getDayFromTimestamp(it.dt.toLong())
                    )
                } ?: emptyList()
            }
        }
    }

    private fun getDayFromTimestamp(value: Long): String {
        return SimpleDateFormat("EEEE", Locale.US).format(Date(value * 1000))
    }


    private fun getWeatherTypeById(value: Int): WeatherType {
        return when {
            value == 0 -> {
                WeatherType.UNKNOW
            }
            value.toString().startsWith("2") -> {
                WeatherType.THUNDERSTORM
            }
            value.toString().startsWith("3") -> {
                WeatherType.DRIZZLE
            }
            value.toString().startsWith("5") -> {
                WeatherType.RAINY
            }
            value.toString().startsWith("6") -> {
                WeatherType.SNOW
            }
            value.toString().startsWith("7") -> {
                WeatherType.ATMOSPHERE
            }
            value.toString() == "800" -> {
                WeatherType.CLEAR
            }
            value.toString().startsWith("80") -> {
                WeatherType.CLOUDY
            }
            else -> {
                WeatherType.SUNNY
            }
        }
    }

}