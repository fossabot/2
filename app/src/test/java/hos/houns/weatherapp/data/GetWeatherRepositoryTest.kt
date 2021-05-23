package hos.houns.weatherapp.data

import hos.houns.weatherapp.device.LocationManager
import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.*
import hos.houns.weatherapp.localstore.store.LocalLocationDataStore
import hos.houns.weatherapp.remotestore.CurrentWeatherResponse
import hos.houns.weatherapp.remotestore.ForecastResponse
import hos.houns.weatherapp.remotestore.WeatherRemoteDataStore
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeInstanceOf
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetWeatherRepositoryTest {

    private lateinit var repository: GetWeatherRepository
    private lateinit var localLocationDataStore: LocalLocationDataStore
    private lateinit var weatherRemoteDataStore: WeatherRemoteDataStore

    @BeforeAll
    fun setUp() {

        localLocationDataStore = mockk()
        coEvery { localLocationDataStore.saveLastLocation(any()) } returns Unit
        coEvery { localLocationDataStore.saveCurrentWeather(any()) } returns  Unit
        coEvery { localLocationDataStore.saveForecastWeather(any()) } returns  Unit
        coEvery { localLocationDataStore.saveUpdateDate(any()) } returns  Unit

        weatherRemoteDataStore = mockk()
        repository = GetWeatherRepository(
            localLocationDataStore,
            weatherRemoteDataStore
        )
    }

    @Nested
    inner class `User's location scenario` {
        @Nested
        inner class `In Success scenario` {
            init {

                coEvery { weatherRemoteDataStore.currentWeather(any()) } returns Either.Right(
                    CurrentWeatherResponse(
                        main = CurrentWeatherResponse.Main(
                            15.0,
                            100.0,
                            10.0,
                            20.0,
                            10.0,
                            10.0
                        ),
                        weather = listOf(CurrentWeatherResponse.Weather(800, "Clear"))
                    )
                )

                coEvery { weatherRemoteDataStore.forecastWeather(any()) } returns
                        Either.Right(
                            ForecastResponse(
                                listOf(
                                    ForecastResponse.Daily(
                                        1622206800,
                                        ForecastResponse.Temp(1.0, 2.0),
                                        listOf(ForecastResponse.Weather(700))
                                    )
                                )
                            )
                        )


            }

            @Test
            fun `Check if fetchRate is called`() = runBlocking {

                repository.getWeather(10.0,12.0,false)
                coVerify {
                    //locationManager.getCurrentLocation()
                    weatherRemoteDataStore.currentWeather(any())
                    weatherRemoteDataStore.forecastWeather(any())
                }
            }

            @Test
            fun `should return Success when repo send Either type Right`() {

                val response = runBlocking { repository.getWeather(10.0,12.0,false) }
                response shouldBeInstanceOf Either.Right::class
                (response as Either.Right).b.currentWeatherUIModel.shouldEqual(
                    CurrentWeatherUIModel(
                        15, 10, 20, WeatherType.CLEAR
                    )
                )

                response.b.forecastWeatherUIModel.shouldEqual(
                    listOf(
                        ForecastWeatherUIModel(
                            2, WeatherType.ATMOSPHERE, "Friday"
                        )
                    )
                )
            }

            @Test
            fun `should get location from local and return Success when repo send Either type Right`() {
                coEvery { localLocationDataStore.getLastLocation() } returns CurrentLocation(10.0,14.0)
                val response = runBlocking { repository.getWeather(10.0,12.0,false) }
                response shouldBeInstanceOf Either.Right::class
                (response as Either.Right).b.currentWeatherUIModel.shouldEqual(
                    CurrentWeatherUIModel(
                        15, 10, 20, WeatherType.CLEAR
                    )
                )

                response.b.forecastWeatherUIModel.shouldEqual(
                    listOf(
                        ForecastWeatherUIModel(
                            2, WeatherType.ATMOSPHERE, "Friday"
                        )
                    )
                )
            }
        }

        @Nested
        inner class `In Failure scenario` {


            @Test
            fun ` currentWeather should return Right when repo send Either type Left`() {

                coEvery { weatherRemoteDataStore.currentWeather(any()) } returns  Either.Left(Failure.NetworkError)
                coEvery { localLocationDataStore.getCurrentWeather() }returns CurrentWeatherUIModel.EMPTY
                coEvery { localLocationDataStore.getForecastWeather() }returns listOf(ForecastWeatherUIModel.EMPTY)
                coEvery { weatherRemoteDataStore.forecastWeather(any()) } returns  Either.Left(Failure.NetworkError)
                val response = runBlocking { repository.getWeather(10.0,12.0,false)}
                response shouldBeInstanceOf Either.Right::class
            }

            @Test
            fun ` forecastWeather should return Right when repo send Either type Left`() {
                coEvery { weatherRemoteDataStore.currentWeather(any()) } returns  Either.Left(Failure.NetworkError)
                coEvery { weatherRemoteDataStore.forecastWeather(any()) } returns  Either.Left(Failure.NetworkError)
                coEvery { localLocationDataStore.getCurrentWeather() }returns CurrentWeatherUIModel.EMPTY
                coEvery { localLocationDataStore.getForecastWeather() }returns listOf(ForecastWeatherUIModel.EMPTY)
                val response = runBlocking { repository.getWeather(10.0,12.0,false)}
                response shouldBeInstanceOf Either.Right::class

            }

        }

    }


}