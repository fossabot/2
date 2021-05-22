package hos.houns.weatherapp.localstore.favorite

import hos.houns.weatherapp.data.favorite.FavoritesLocalDataStore
import hos.houns.weatherapp.domain.core.CoroutineDispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class FavoritesLocalDataStoreImpl(private val coroutineDispatchers: CoroutineDispatchers,
                                  private val database: AppDatabase
): FavoritesLocalDataStore {

    override suspend fun load(): Flow<List<Favorite>> {
        return withContext(coroutineDispatchers.io){
            database.favouriteDao().getAll()
        }
    }

    override suspend fun addFavourite(value: Favorite) {
        return withContext(coroutineDispatchers.io){
            database.favouriteDao().insertAll(value)
        }
    }

    override suspend fun deleteFavourite(value: Favorite) {
        return withContext(coroutineDispatchers.io){
            database.favouriteDao().delete(value)
        }
    }

}