package hos.houns.weatherapp.domain.usecases
import hos.houns.weatherapp.data.GetWeatherRepository
import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.WeatherUiModel

sealed class GetWeatherResult {
    data class Success(val value: WeatherUiModel) : GetWeatherResult()
    data class Error(val error: Failure) : GetWeatherResult()
}

class GetWeatherUseCase(private val repository: GetWeatherRepository) {
      suspend fun execute(latitude: Double?,longitude:Double?): GetWeatherResult {
        return  when (val result = repository.getWeather(latitude, longitude)) {
            is Either.Left -> GetWeatherResult.Error(result.a)
            is Either.Right -> GetWeatherResult.Success(result.b)
        }
    }
}