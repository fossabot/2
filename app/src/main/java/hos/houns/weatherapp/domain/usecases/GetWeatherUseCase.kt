package hos.houns.weatherapp.domain.usecases
import hos.houns.weatherapp.domain.core.Either

interface GetWeatherUseCase{
    suspend fun execute(latitude: Double?,longitude:Double?): GetWeatherResult
}

class GetWeatherUseCaseImpl(private val repository: GetWeatherRepository) : GetWeatherUseCase {
     override suspend fun execute(latitude: Double?,longitude:Double?): GetWeatherResult {
        return if (latitude==null  && longitude==null){
            when (val result = repository.getWeather(null,null)) {
                is Either.Left -> GetWeatherResult.Error(result.a)
                is Either.Right -> GetWeatherResult.Success(result.b)
            }
        }else{
            when (val result = repository.getWeather(latitude,longitude)) {
                is Either.Left -> GetWeatherResult.Error(result.a)
                is Either.Right -> GetWeatherResult.Success(result.b)
            }
        }

    }
}