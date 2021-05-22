package hos.houns.weatherapp.domain.usecases.favourite

import hos.houns.weatherapp.domain.entity.FavouriteUiModel
import hos.houns.weatherapp.domain.usecases.GetWeatherUseCase
import hos.houns.weatherapp.domain.usecases.GetWeatherUseCaseImpl
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class AddDeleteFavoriteUseCaseImplTest{
    private lateinit var repo: FavouritesRepository
    private lateinit var usecase: AddDeleteFavouriteUseCase

    @BeforeAll
    fun setUp() {
        repo = mockk()
        usecase = AddDeleteFavouriteUseCaseImpl(repo)
    }

    @Test
    fun `test add` (){
        coEvery { repo.addFavourite(any()) } returns Unit
        runBlocking {usecase.execute(FavouriteUiModel.EMPTY,false) }
        coVerify { repo.addFavourite(FavouriteUiModel.EMPTY) }
    }

    @Test
    fun `test deletion` (){
        coEvery { repo.deleteFavourite(any()) } returns Unit
        runBlocking {usecase.execute(FavouriteUiModel.EMPTY,true) }
        coVerify { repo.deleteFavourite(FavouriteUiModel.EMPTY) }
    }
}