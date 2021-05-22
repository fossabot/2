package hos.houns.weatherapp.domain.usecases.favorite

import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import kotlinx.coroutines.flow.Flow

interface FavoritesRepository {
    suspend fun load():  Flow<List<FavoriteUiModel>>
    suspend fun addFavourite(value: FavoriteUiModel)
    suspend fun deleteFavourite(value: FavoriteUiModel)
}