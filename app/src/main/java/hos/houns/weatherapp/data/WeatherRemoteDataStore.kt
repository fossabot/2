package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.CurrentLocation
import hos.houns.weatherapp.remotestore.CurrentWeatherResponse
import hos.houns.weatherapp.remotestore.ForecastResponse
import java.math.BigDecimal

interface WeatherRemoteDataStore {
    suspend fun currentWeather(location:CurrentLocation):Either<Failure, CurrentWeatherResponse?>
    suspend fun forecastWeather(location:CurrentLocation):Either<Failure, ForecastResponse?>
}