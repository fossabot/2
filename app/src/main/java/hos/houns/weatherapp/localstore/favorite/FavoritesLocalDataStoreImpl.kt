package hos.houns.weatherapp.localstore.favorite

import hos.houns.weatherapp.data.favorite.FavoritesLocalDataStore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class FavoritesLocalDataStoreImpl(
    private val database: AppDatabase
): FavoritesLocalDataStore {

    override suspend fun load(): Flow<List<Favorite>> {
        return withContext(Dispatchers.IO){
            database.favouriteDao().getAll()
        }
    }

    override suspend fun addFavourite(value: Favorite) {
        return withContext(Dispatchers.IO){
            database.favouriteDao().insertAll(value)
        }
    }

    override suspend fun deleteFavourite(value: Favorite) {
        return withContext(Dispatchers.IO){
            database.favouriteDao().delete(value)
        }
    }

}