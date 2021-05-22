package hos.houns.weatherapp.remotestore

import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.CurrentLocation

class WeatherRemoteDataStore(
    private val openWeatherApi: OpenWeatherApi,
    private val remoteErrorFactory: RemoteErrorFactory
)  {

     suspend fun currentWeather(location: CurrentLocation): Either<Failure, CurrentWeatherResponse?> {
        return try {
            Either.Right(
                openWeatherApi
                    .currentWeather(
                        lat = location.latitude.toString(),
                        lon = location.longitude.toString()
                    )
            )
        } catch (exception: Exception) {
            exception.printStackTrace()
            Either.Left(remoteErrorFactory.produce(exception))
        }
    }

    suspend fun forecastWeather(location: CurrentLocation): Either<Failure, ForecastResponse?> {
        return try {
            Either.Right(
                openWeatherApi
                    .forecastWeather(
                        lat = location.latitude.toString(),
                        lon = location.longitude.toString()
                    )
            )
        } catch (exception: Exception) {
            exception.printStackTrace()
            Either.Left(remoteErrorFactory.produce(exception))
        }
    }
}