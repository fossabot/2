package hos.houns.weatherapp.domain.usecases

import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.CurrentWeatherUIModel
import hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel
import hos.houns.weatherapp.domain.entity.WeatherType
import hos.houns.weatherapp.domain.entity.WeatherUiModel
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.`should be instance of`
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetWeatherUseCaseImplTest{

    private lateinit var repo: GetWeatherRepository
    private lateinit var usecase: GetWeatherUseCase

    @BeforeAll
    fun setUp() {
        repo = mockk()
        usecase = GetWeatherUseCaseImpl(repo)
    }

    @Nested
    inner class `In Success scenario` {
        init {
            coEvery { repo.getWeather() } returns
                    Either.Right(WeatherUiModel(
                        CurrentWeatherUIModel(temp = 24,
                        tempMin = 22,tempMax = 27,type = WeatherType.SUNNY), listOf(
                            ForecastWeatherUIModel(temp = 0,type = WeatherType.CLOUDY,"Friday")
                        )))
        }

        @Test
        fun `Check if calculate is called`() = runBlocking {
            usecase()
            coVerify { repo.getWeather()}
        }

        @Test
        fun `should return String when repo send Either type Right`()  {
            val result = runBlocking {  usecase()}
            result `should be instance of` GetWeatherResult.Success::class
            ( result as GetWeatherResult.Success).value.currentWeatherUIModel.shouldEqual(CurrentWeatherUIModel(temp = 24,
                tempMin = 22,tempMax = 27,type = WeatherType.SUNNY))
            result.value.forecastWeatherUIModel.shouldEqual(listOf(
                ForecastWeatherUIModel(temp = 0,type = WeatherType.CLOUDY,"Friday")
            ))
        }

    }

    @Nested
    inner class `In Error scenario` {
        @ParameterizedTest
        @MethodSource("hos.houns.weatherapp.domain.usecases.GetWeatherUseCaseImplTest#provideData")
        fun `should return Error when repo send Either type Right`(input: Failure)  {
            coEvery { repo.getWeather() } returns  Either.Left(input)
            val result = runBlocking {  usecase()}
            result `should be instance of` GetWeatherResult.Error::class
            (result as GetWeatherResult.Error) .error.`should be instance of`( input::class)
        }


    }

    companion object{
        @JvmStatic
        fun  provideData()= listOf<Arguments>(
            Arguments.of(Failure.FineLocationPermissionNotGrantedError),
            Arguments.of(Failure.NetworkConnection),
            Arguments.of(Failure.LocationIsDisabledError),
            Arguments.of(Failure.ServerError),
            Arguments.of(Failure.ServerTimeoutError),
            Arguments.of(Failure.UnknownError)
        )
    }

}