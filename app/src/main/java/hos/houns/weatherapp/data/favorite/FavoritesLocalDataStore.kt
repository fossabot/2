package hos.houns.weatherapp.data.favorite

import hos.houns.weatherapp.localstore.favorite.Favorite
import kotlinx.coroutines.flow.Flow

interface FavoritesLocalDataStore {
    suspend fun load(): Flow<List<Favorite>>
    suspend fun addFavourite(value: Favorite)
    suspend fun deleteFavourite(value: Favorite)
}