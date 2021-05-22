package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.core.CoroutineDispatchers
import hos.houns.weatherapp.domain.core.CoroutineDispatchersImpl
import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.*
import hos.houns.weatherapp.domain.usecases.GetWeatherUseCaseImpl
import hos.houns.weatherapp.domain.usecases.LocationManager
import hos.houns.weatherapp.remotestore.CurrentWeatherResponse
import hos.houns.weatherapp.remotestore.ForecastResponse
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import io.mockk.spyk
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeInstanceOf
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetWeatherRepositoryImplTest {

    private lateinit var repository: GetWeatherRepositoryImpl
    private lateinit var coroutineDispatchers: CoroutineDispatchers
    private lateinit var locationManager: LocationManager
    private lateinit var localLocationDataStore: LocalLocationDataStore
    private lateinit var weatherRemoteDataStore: WeatherRemoteDataStore

    @BeforeAll
    fun setUp() {
        coroutineDispatchers = spyk()
        coEvery { coroutineDispatchers.io } returns CoroutineDispatchersImpl().io

        locationManager = mockk()


        localLocationDataStore = mockk()
        coEvery { localLocationDataStore.saveLastLocation(any()) } returns Unit
        coEvery { localLocationDataStore.saveCurrentWeather(any()) } returns  Unit
        coEvery { localLocationDataStore.saveForecastWeather(any()) } returns  Unit
        coEvery { localLocationDataStore.saveUpdateDate(any()) } returns  Unit

        weatherRemoteDataStore = mockk()
        repository = GetWeatherRepositoryImpl(
            coroutineDispatchers,
            locationManager,
            localLocationDataStore,
            weatherRemoteDataStore
        )
    }

    @Nested
    inner class `User's location scenario` {
        @Nested
        inner class `In Success scenario` {
            init {
                coEvery { locationManager.isLocationEnabled() } returns true
                coEvery { locationManager.hasFinePermissionGranted() } returns true
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

                repository.getWeather(10.0,12.0)
                coVerify {
                    //locationManager.getCurrentLocation()
                    weatherRemoteDataStore.currentWeather(any())
                    weatherRemoteDataStore.forecastWeather(any())
                }
            }

            @Test
            fun `should return Success when repo send Either type Right`() {
                coEvery { locationManager.getCurrentLocation() } returns CurrentLocation(10.0, 14.0)

                val response = runBlocking { repository.getWeather(10.0,12.0) }
                response shouldBeInstanceOf Either.Right::class
                (response as Either.Right).b.currentWeatherUIModel.shouldEqual(
                    CurrentWeatherUIModel(
                        15, 10, 20, WeatherType.CLEAR
                    )
                )

                (response as Either.Right).b.forecastWeatherUIModel.shouldEqual(
                    listOf(
                        ForecastWeatherUIModel(
                            2, WeatherType.ATMOSPHERE, "Friday"
                        )
                    )
                )
            }

            @Test
            fun `should get location from local and return Success when repo send Either type Right`() {
                coEvery { locationManager.getCurrentLocation() } returns CurrentLocation(0.0, 0.0)
                coEvery { localLocationDataStore.getLastLocation() } returns CurrentLocation(10.0,14.0)
                val response = runBlocking { repository.getWeather(10.0,12.0) }
                response shouldBeInstanceOf Either.Right::class
                (response as Either.Right).b.currentWeatherUIModel.shouldEqual(
                    CurrentWeatherUIModel(
                        15, 10, 20, WeatherType.CLEAR
                    )
                )

                (response as Either.Right).b.forecastWeatherUIModel.shouldEqual(
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
            fun `Location is disabled`() {
                coEvery { locationManager.isLocationEnabled() } returns false
                coEvery { localLocationDataStore.getLastLocation() } returns CurrentLocation(0.0, 0.0)
                val response = runBlocking { repository.getWeather(10.0,12.0) }
                response shouldBeInstanceOf Either.Right::class
                (response as Either.Right).b.shouldBeInstanceOf<WeatherUiModel>()
            }

            @Test
            fun `Fine Permission is denied`() {
                coEvery { locationManager.isLocationEnabled() } returns true
                coEvery { locationManager.hasFinePermissionGranted() } returns false
                val response = runBlocking { repository.getWeather(10.0,12.0) }
                response shouldBeInstanceOf Either.Left::class
                (response as Either.Left).a.shouldBeInstanceOf<Failure.FineLocationPermissionNotGrantedError>()
            }

            @Test
            fun ` currentWeather should return Failure when repo send Either type Left`() {
                coEvery { locationManager.isLocationEnabled() } returns true
                coEvery { locationManager.hasFinePermissionGranted() } returns true

                coEvery { weatherRemoteDataStore.currentWeather(any()) } returns  Either.Left(Failure.ServerError)
                val response = runBlocking { repository.getWeather(10.0,12.0)}
                response shouldBeInstanceOf Either.Right::class
                response shouldEqual Either.Right(WeatherUiModel(currentWeatherUIModel = CurrentWeatherUIModel(0,0,0,WeatherType.CLOUDY),forecastWeatherUIModel = listOf()))
            }

            @Test
            fun ` forecastWeather should return Failure when repo send Either type Left`() {
                coEvery { locationManager.isLocationEnabled() } returns true
                coEvery { locationManager.hasFinePermissionGranted() } returns true
                coEvery { weatherRemoteDataStore.forecastWeather(any()) } returns  Either.Left(Failure.ServerError)

                val response = runBlocking { repository.getWeather(10.0,12.0)}
                response shouldBeInstanceOf Either.Right::class
                response shouldEqual Either.Right(WeatherUiModel(currentWeatherUIModel = CurrentWeatherUIModel(15,10,20,WeatherType.CLEAR),forecastWeatherUIModel = listOf()))
            }

        }

    }


}