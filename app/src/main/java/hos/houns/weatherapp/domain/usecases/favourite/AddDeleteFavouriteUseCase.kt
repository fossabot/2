package hos.houns.weatherapp.domain.usecases.favourite

import hos.houns.weatherapp.domain.entity.FavouriteUiModel

interface AddDeleteFavouriteUseCase {
    suspend fun execute(favourite: FavouriteUiModel, isDeletion: Boolean)
}

class AddDeleteFavouriteUseCaseImpl(private val repository: FavouritesRepository) :
    AddDeleteFavouriteUseCase {
    override suspend fun execute(favourite: FavouriteUiModel, isDeletion: Boolean) {
        return if (isDeletion) {
            repository.deleteFavourite(favourite)
        } else {
            repository.addFavourite(favourite)
        }
    }
}