package hos.houns.weatherapp.domain.usecases.favourite

import hos.houns.weatherapp.domain.entity.FavouriteUiModel
import hos.houns.weatherapp.domain.usecases.FavouritesResult
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.`should equal`
import org.amshove.kluent.shouldBeInstanceOf
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class LoadFavouritesUseCaseImplTest{

    private lateinit var usecase: LoadFavouritesUseCaseImpl
    private lateinit var repo: FavouritesRepository

    @BeforeAll
    fun setUp() {
        repo = mockk()
        usecase = LoadFavouritesUseCaseImpl(repo)
    }


    @Test
    fun test(){
        coEvery {
            repo.load()
        } returns  flowOf(listOf(FavouriteUiModel("id","label",10.0,13.0)))

       val  result = runBlocking { usecase.execute() }
        result shouldBeInstanceOf (FavouritesResult.LoadResult::class.java)
        runBlocking {
            val actual = mutableListOf<FavouriteUiModel>()
            ( result as FavouritesResult.LoadResult).value.collect {
              actual.addAll(it)
            }
            actual shouldEqual listOf(FavouriteUiModel("id","label",10.0,13.0))
        }

    }
}