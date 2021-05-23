package hos.houns.weatherapp.localstore

import android.content.Context
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import android.content.SharedPreferences
import com.google.gson.Gson
import hos.houns.weatherapp.domain.entity.CurrentLocation
import hos.houns.weatherapp.domain.entity.CurrentWeatherUIModel
import hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel
import hos.houns.weatherapp.localstore.store.LocalLocationDataStore
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.any
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class LocalLocationDataStoreTest{
    private lateinit var editor: SharedPreferences.Editor
    private lateinit var sharedPrefs: SharedPreferences
    private lateinit var localStore: LocalLocationDataStore

    @BeforeAll
    fun setUp(){
        sharedPrefs = mockk()
        val context: Context = mockk()
        every { context.getSharedPreferences(any(),any()) } returns  sharedPrefs
        editor = mockk()
        every {  sharedPrefs.edit() } returns editor
        every { sharedPrefs.edit().apply() } returns Unit
        localStore = LocalLocationDataStore(context)
     }

    @Test
    fun testSaveLastLocation(){

        every { sharedPrefs.edit().putString(LocalLocationDataStore.LONGITUDE_KEY,"10.23") } returns editor
        every { sharedPrefs.edit().putString(LocalLocationDataStore.LATITUDE_KEY,"14.3") } returns editor
        val result = runBlocking { localStore.saveLastLocation(CurrentLocation(14.3,10.23)) }
        result.shouldEqual(Unit)
    }

    @Test
    fun testGetLastLocation(){
        every { sharedPrefs.getString(LocalLocationDataStore.LONGITUDE_KEY,"0.0") } returns "10.23"
        every { sharedPrefs.getString(LocalLocationDataStore.LATITUDE_KEY,"0.0") } returns "14.3"
        val result = runBlocking { localStore.getLastLocation() }
        result shouldEqual  CurrentLocation(14.3,10.23)
    }

    @Test
    fun testSaveCurrentWeather(){
        every { editor.apply() } returns Unit
        every { sharedPrefs.edit().putString(LocalLocationDataStore.CURRENT_WEATHER_KEY, any()) } returns editor

        val  result = runBlocking { localStore.saveCurrentWeather(CurrentWeatherUIModel.EMPTY) }
        result.shouldEqual(Unit)

    }

    @Test
    fun testGetCurrentWeather(){
        every { sharedPrefs.getString(LocalLocationDataStore.CURRENT_WEATHER_KEY,any()) } returns Gson().toJson(CurrentWeatherUIModel.EMPTY)
        val result = runBlocking { localStore.getCurrentWeather()}
        result shouldEqual  CurrentWeatherUIModel.EMPTY
    }

    @Test
    fun testSaveForecastWeather(){
        every { editor.apply() } returns Unit
        every { sharedPrefs.edit().putString(LocalLocationDataStore.FORECAST_KEY, any()) } returns editor

        val  result = runBlocking { localStore.saveForecastWeather(listOf(ForecastWeatherUIModel.EMPTY)) }
        result.shouldEqual(Unit)

    }

    @Test
    fun testGetForecastWeather(){
        every { sharedPrefs.getString(LocalLocationDataStore.FORECAST_KEY,any()) } returns Gson().toJson(
            listOf(ForecastWeatherUIModel.EMPTY))
        val result = runBlocking { localStore.getForecastWeather()}
        result shouldEqual  listOf(ForecastWeatherUIModel.EMPTY)
    }

    @Test
    fun testSaveUpdateDate(){
        every { sharedPrefs.edit().putString(LocalLocationDataStore.UPDATED_DATE_KEY,any()) } returns editor
        val result = runBlocking { localStore.saveUpdateDate("14.3") }
        result.shouldEqual(Unit)
    }

    @Test
    fun testGetUpdateDate(){
        every { sharedPrefs.getString(LocalLocationDataStore.UPDATED_DATE_KEY,any()) } returns "10.23"
        val result = runBlocking { localStore.getUpdatedDate() }
        result shouldEqual  "10.23"
    }
}