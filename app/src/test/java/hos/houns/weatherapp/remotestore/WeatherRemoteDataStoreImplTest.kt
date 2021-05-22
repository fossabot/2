package hos.houns.weatherapp.remotestore

import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.entity.CurrentLocation
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class WeatherRemoteDataStoreImplTest {
    private lateinit var remoteDataStore: WeatherRemoteDataStoreImpl
    private lateinit var openWeatherApi: OpenWeatherApi
    private lateinit var remoteErrorFactory: RemoteErrorFactory

    @BeforeAll
    fun beforeAll() {
        openWeatherApi = mockk()
        remoteErrorFactory = mockk()
        remoteDataStore = WeatherRemoteDataStoreImpl(openWeatherApi, remoteErrorFactory)
    }

    @Test
    fun `Fetch current Weather with success`() {
        coEvery {
            openWeatherApi.currentWeather(any(), any(), any())
        } returns CurrentWeatherResponse(
            weather = listOf(CurrentWeatherResponse.Weather(800, "Clear")),
            main = CurrentWeatherResponse.Main(
                10.0,
                10.0, 10.0,
                10.0, 10.0, 10.0
            )
        )
        val response = runBlocking { remoteDataStore.currentWeather(CurrentLocation(10.0, 11.0)) }
        response.shouldBeInstanceOf(Either.Right::class)
    }

    @Test
    fun `Fetch forecast Weather with success`() {
        coEvery {
            openWeatherApi.forecastWeather(any(), any(), any())
        } returns ForecastResponse(
            daily = listOf(
                ForecastResponse.Daily(
                    12345,
                    ForecastResponse.Temp(10.0, 11.0),
                    listOf(ForecastResponse.Weather(800))
                )
            )
        )
        val response = runBlocking { remoteDataStore.forecastWeather(CurrentLocation(10.0, 11.0)) }
        response.shouldBeInstanceOf(Either.Right::class)

    }
}