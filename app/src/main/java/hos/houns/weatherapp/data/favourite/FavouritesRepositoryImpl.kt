package hos.houns.weatherapp.data.favourite

import hos.houns.weatherapp.domain.core.CoroutineDispatchers
import hos.houns.weatherapp.domain.entity.FavouriteUiModel
import hos.houns.weatherapp.domain.usecases.favourite.FavouritesRepository
import hos.houns.weatherapp.localstore.favourite.Favourite
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class FavouritesRepositoryImpl(private val coroutineDispatchers: CoroutineDispatchers,
                               private val favouritesLocalDataStore: FavouritesLocalDataStore):
    FavouritesRepository {
    override suspend fun load(): Flow<List<FavouriteUiModel>> {
        return withContext(coroutineDispatchers.io){
            favouritesLocalDataStore.load().map { lists ->
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
        return withContext(coroutineDispatchers.io){
            favouritesLocalDataStore.addFavourite(Favourite(value.id,value.label,value.latitude,value.longitude))
        }
    }

    override suspend fun deleteFavourite(value: FavouriteUiModel) {
        return withContext(coroutineDispatchers.io){
            favouritesLocalDataStore.deleteFavourite(Favourite(value.id,value.label,value.latitude,value.longitude))
        }
    }
}