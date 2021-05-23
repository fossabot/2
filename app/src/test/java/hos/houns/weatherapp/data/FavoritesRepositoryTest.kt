package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import hos.houns.weatherapp.domain.usecases.AddDeleteFavouriteUseCase
import hos.houns.weatherapp.localstore.database.Favorite
import hos.houns.weatherapp.localstore.store.FavoritesLocalDataStore
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeInstanceOf
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class FavoritesRepositoryTest{
    private lateinit var repo: FavoritesRepository
    private lateinit var store: FavoritesLocalDataStore

    @BeforeAll
    fun setUp() {
        store = mockk()
        repo = FavoritesRepository(store)
    }

    @Test
    fun `test add Favourite`(){
       coEvery { store.addFavourite(any()) } returns Unit
        runBlocking {repo.addFavourite(FavoriteUiModel.EMPTY) }
        coVerify { store.addFavourite(Favorite("","",0.0,0.0)) }
    }

    @Test
    fun `test delete Favourite`(){
        coEvery { store.deleteFavourite(any()) } returns Unit
        runBlocking {repo.deleteFavourite(FavoriteUiModel.EMPTY) }
        coVerify { store.deleteFavourite(Favorite("","",0.0,0.0)) }
    }

    @Test
    fun `test load Favourites`(){
        coEvery { store.load() } returns flowOf(listOf(Favorite("","",0.0,0.0)))
        val result = runBlocking {repo.load() }
        coVerify { store.load() }

        runBlocking {
            result.collect {
                it.size.shouldEqual(1)
            }
        }

    }

}