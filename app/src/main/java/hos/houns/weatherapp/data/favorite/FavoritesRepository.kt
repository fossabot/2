package hos.houns.weatherapp.data.favorite
import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import hos.houns.weatherapp.localstore.favorite.Favorite
import hos.houns.weatherapp.localstore.favorite.FavoritesLocalDataStore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class FavoritesRepository(private val favoritesLocalDataStore: FavoritesLocalDataStore) {
     suspend fun load(): Flow<List<FavoriteUiModel>> {
        return withContext(Dispatchers.IO){
            favoritesLocalDataStore.load().map { lists ->
                lists.map {
                   FavoriteUiModel(it.id,
                       it.label?:"",
                       it.latitude?:0.0,
                       it.longitude?:0.0,)
               }
            }
        }
    }

     suspend fun addFavourite(value: FavoriteUiModel) {
        return withContext(Dispatchers.IO){
            favoritesLocalDataStore.addFavourite(Favorite(value.id,value.label,value.latitude,value.longitude))
        }
    }

     suspend fun deleteFavourite(value: FavoriteUiModel) {
        return withContext(Dispatchers.IO){
            favoritesLocalDataStore.deleteFavourite(Favorite(value.id,value.label,value.latitude,value.longitude))
        }
    }
}