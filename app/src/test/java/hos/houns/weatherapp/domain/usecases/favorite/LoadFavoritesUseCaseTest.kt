package hos.houns.weatherapp.domain.usecases.favorite

import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeInstanceOf
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class LoadFavoritesUseCaseTest{

    private lateinit var usecase: LoadFavoritesUseCase
    private lateinit var repo: FavoritesRepository

    @BeforeAll
    fun setUp() {
        repo = mockk()
        usecase = LoadFavoritesUseCase(repo)
    }


    @Test
    fun test(){
        coEvery {
            repo.load()
        } returns  flowOf(listOf(FavoriteUiModel("id","label",10.0,13.0)))

       val  result = runBlocking { usecase.execute() }
        result shouldBeInstanceOf (LoadFavoriteResult::class.java)
        runBlocking {
            val actual = mutableListOf<FavoriteUiModel>()

            result.value.collect {
              actual.addAll(it)
            }
            actual shouldEqual listOf(FavoriteUiModel("id","label",10.0,13.0))
        }

    }
}