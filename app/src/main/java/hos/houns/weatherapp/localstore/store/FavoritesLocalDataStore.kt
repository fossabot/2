package hos.houns.weatherapp.localstore.store

import hos.houns.weatherapp.localstore.database.AppDatabase
import hos.houns.weatherapp.localstore.database.Favorite
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class FavoritesLocalDataStore(
    private val database: AppDatabase
){

     suspend fun load(): Flow<List<Favorite>> {
        return withContext(Dispatchers.IO){
            database.favouriteDao().getAll()
        }
    }

     suspend fun addFavourite(value: Favorite) {
        return withContext(Dispatchers.IO){
            database.favouriteDao().insertAll(value)
        }
    }

     suspend fun deleteFavourite(value: Favorite) {
        return withContext(Dispatchers.IO){
            database.favouriteDao().delete(value)
        }
    }

}