package hos.houns.weatherapp.domain.usecases

import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.core.Result
import hos.houns.weatherapp.domain.entity.FavouriteUiModel
import hos.houns.weatherapp.domain.entity.WeatherUiModel
import kotlinx.coroutines.flow.Flow


sealed class GetWeatherResult : Result {
    data class Success(val value: WeatherUiModel) : GetWeatherResult()
    data class Error(val error: Failure) : GetWeatherResult()
}


sealed class FavouritesResult : Result {
    data class LoadResult(val value: Flow<List<FavouriteUiModel>>) : FavouritesResult()
}