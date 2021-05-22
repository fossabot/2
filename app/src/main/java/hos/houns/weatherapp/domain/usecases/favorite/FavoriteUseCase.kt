package hos.houns.weatherapp.domain.usecases.favorite

import hos.houns.weatherapp.data.favorite.FavoritesRepository
import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import kotlinx.coroutines.flow.Flow


class AddDeleteFavouriteUseCase(private val repository: FavoritesRepository)  {
     suspend fun execute(favorite: FavoriteUiModel, isDeletion: Boolean) {
        return if (isDeletion) {
            repository.deleteFavourite(favorite)
        } else {
            repository.addFavourite(favorite)
        }
    }
}

data class LoadFavoriteResult(val value: Flow<List<FavoriteUiModel>>)
class LoadFavoritesUseCase(private val repository: FavoritesRepository){
     suspend fun execute(): LoadFavoriteResult {
        return LoadFavoriteResult(repository.load())
    }
}
