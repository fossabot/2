package hos.houns.weatherapp.localstore.favourite

import hos.houns.weatherapp.data.favourite.FavouritesLocalDataStore
import hos.houns.weatherapp.domain.core.CoroutineDispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class FavouritesLocalDataStoreImpl(private val coroutineDispatchers: CoroutineDispatchers,
                                   private val database: AppDatabase
): FavouritesLocalDataStore {

    override suspend fun load(): Flow<List<Favourite>> {
        return withContext(coroutineDispatchers.io){
            database.favouriteDao().getAll()
        }
    }

    override suspend fun addFavourite(value: Favourite) {
        return withContext(coroutineDispatchers.io){
            database.favouriteDao().insertAll(value)
        }
    }

    override suspend fun deleteFavourite(value: Favourite) {
        return withContext(coroutineDispatchers.io){
            database.favouriteDao().delete(value)
        }
    }

}