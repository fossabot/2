package hos.houns.weatherapp.domain.usecases.favourite
import hos.houns.weatherapp.domain.usecases.FavouritesResult

interface LoadFavouritesUseCase{
    suspend fun execute(): FavouritesResult
}

class LoadFavouritesUseCaseImpl(private val repository: FavouritesRepository) :
    LoadFavouritesUseCase {
     override suspend fun execute(): FavouritesResult {
        return FavouritesResult.LoadResult(repository.load())
    }
}