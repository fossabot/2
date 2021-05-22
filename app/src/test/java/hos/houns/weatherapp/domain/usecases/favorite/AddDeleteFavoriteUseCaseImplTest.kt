package hos.houns.weatherapp.domain.usecases.favorite

import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class AddDeleteFavoriteUseCaseImplTest{
    private lateinit var repo: FavoritesRepository
    private lateinit var usecase: AddDeleteFavouriteUseCase

    @BeforeAll
    fun setUp() {
        repo = mockk()
        usecase = AddDeleteFavouriteUseCase(repo)
    }

    @Test
    fun `test add` (){
        coEvery { repo.addFavourite(any()) } returns Unit
        runBlocking {usecase.execute(FavoriteUiModel.EMPTY,false) }
        coVerify { repo.addFavourite(FavoriteUiModel.EMPTY) }
    }

    @Test
    fun `test deletion` (){
        coEvery { repo.deleteFavourite(any()) } returns Unit
        runBlocking {usecase.execute(FavoriteUiModel.EMPTY,true) }
        coVerify { repo.deleteFavourite(FavoriteUiModel.EMPTY) }
    }
}