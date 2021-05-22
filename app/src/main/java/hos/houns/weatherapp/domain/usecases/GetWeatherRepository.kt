package hos.houns.weatherapp.domain.usecases

import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.WeatherUiModel

interface GetWeatherRepository {
    suspend fun getWeather(latitude: Double?,longitude:Double?): Either<Failure, WeatherUiModel>
}