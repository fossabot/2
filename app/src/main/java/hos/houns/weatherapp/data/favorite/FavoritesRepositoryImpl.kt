package hos.houns.weatherapp.data.favorite
import hos.houns.weatherapp.domain.entity.FavouriteUiModel
import hos.houns.weatherapp.domain.usecases.favourite.FavouritesRepository
import hos.houns.weatherapp.localstore.favorite.Favorite
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class FavoritesRepositoryImpl(private val favoritesLocalDataStore: FavoritesLocalDataStore):
    FavouritesRepository {
    override suspend fun load(): Flow<List<FavouriteUiModel>> {
        return withContext(Dispatchers.IO){
            favoritesLocalDataStore.load().map { lists ->
                lists.map {
                   FavouriteUiModel(it.id,
                       it.label?:"",
                       it.latitude?:0.0,
                       it.longitude?:0.0,)
               }
            }
        }
    }

    override suspend fun addFavourite(value: FavouriteUiModel) {
        return withContext(Dispatchers.IO){
            favoritesLocalDataStore.addFavourite(Favorite(value.id,value.label,value.latitude,value.longitude))
        }
    }

    override suspend fun deleteFavourite(value: FavouriteUiModel) {
        return withContext(Dispatchers.IO){
            favoritesLocalDataStore.deleteFavourite(Favorite(value.id,value.label,value.latitude,value.longitude))
        }
    }
}