package hos.houns.weatherapp.domain.usecases.favourite

import hos.houns.weatherapp.domain.entity.FavouriteUiModel
import kotlinx.coroutines.flow.Flow

interface FavouritesRepository {
    suspend fun load():  Flow<List<FavouriteUiModel>>
    suspend fun addFavourite(value: FavouriteUiModel)
    suspend fun deleteFavourite(value: FavouriteUiModel)
}