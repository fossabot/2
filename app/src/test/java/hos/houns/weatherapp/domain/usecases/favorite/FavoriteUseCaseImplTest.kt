package hos.houns.weatherapp.domain.usecases.favorite

import hos.houns.weatherapp.data.FavoritesRepository
import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import hos.houns.weatherapp.domain.usecases.FavoriteUseCase
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeInstanceOf
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class FavoriteUseCaseImplTest{
    private lateinit var repo: FavoritesRepository
    private lateinit var usecase: FavoriteUseCase

    @BeforeAll
    fun setUp() {
        repo = mockk()
        usecase = FavoriteUseCase(repo)
    }

    @Test
    fun `test add` (){
        coEvery { repo.addFavourite(any()) } returns Unit
        runBlocking {usecase.addFavorite(FavoriteUiModel.EMPTY) }
        coVerify { repo.addFavourite(FavoriteUiModel.EMPTY) }
    }

    @Test
    fun `test deletion` (){
        coEvery { repo.deleteFavourite(any()) } returns Unit

        runBlocking {usecase.deleteFavorite(FavoriteUiModel.EMPTY) }
        coVerify { repo.deleteFavourite(FavoriteUiModel.EMPTY) }
    }

    @Test
    fun `test load`(){
        coEvery {
            repo.load()
        } returns  flowOf(listOf(FavoriteUiModel("id","label",10.0,13.0)))

        val  result = runBlocking { usecase.loadFavorites() }
        result shouldBeInstanceOf (FavoriteUseCase.LoadFavoriteResult::class.java)
        runBlocking {
            val actual = mutableListOf<FavoriteUiModel>()

            result.value.collect {
                actual.addAll(it)
            }

            actual shouldEqual listOf(FavoriteUiModel("id","label",10.0,13.0))
        }

    }
}