package hos.houns.weatherapp.domain.usecases

import hos.houns.weatherapp.data.FavoritesRepository
import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import kotlinx.coroutines.flow.Flow

class FavoriteUseCase(private val repository: FavoritesRepository)  {

    suspend fun addFavorite(favorite: FavoriteUiModel){
        repository.addFavourite(favorite)
    }

    suspend fun deleteFavorite(favorite: FavoriteUiModel){
        repository.deleteFavourite(favorite)
    }

    suspend fun loadFavorites(): LoadFavoriteResult {
        return LoadFavoriteResult(repository.load())
    }

    data class LoadFavoriteResult(val value: Flow<List<FavoriteUiModel>>)
}


