package hos.houns.weatherapp.data.favourite

import hos.houns.weatherapp.localstore.favourite.Favourite
import kotlinx.coroutines.flow.Flow

interface FavouritesLocalDataStore {
    suspend fun load(): Flow<List<Favourite>>
    suspend fun addFavourite(value: Favourite)
    suspend fun deleteFavourite(value: Favourite)
}