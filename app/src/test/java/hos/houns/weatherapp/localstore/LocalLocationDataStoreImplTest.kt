package hos.houns.weatherapp.localstore

import android.content.Context
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import android.content.SharedPreferences
import hos.houns.weatherapp.domain.entity.CurrentLocation
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.Test


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class LocalLocationDataStoreImplTest{
    private lateinit var editor: SharedPreferences.Editor
    private lateinit var sharedPrefs: SharedPreferences
    private lateinit var localStore: LocalLocationDataStoreImpl

    @BeforeAll
    fun setUp(){
        sharedPrefs = mockk()
        val context: Context = mockk()
        every { context.getSharedPreferences(any(),any()) } returns  sharedPrefs
        editor = mockk()

        every {  sharedPrefs.edit() } returns editor
        localStore = LocalLocationDataStoreImpl(context)
     }

    @Test
    fun testSaveData(){
        every { sharedPrefs.edit().apply() } returns Unit
        every { sharedPrefs.edit().putString(LocalLocationDataStoreImpl.LONGITUDE_KEY,"10.23") } returns editor
        every { sharedPrefs.edit().putString(LocalLocationDataStoreImpl.LATITUDE_KEY,"14.3") } returns editor
        val result = runBlocking { localStore.saveLastLocation(CurrentLocation(14.3,10.23)) }
        result.shouldEqual(Unit)
    }

    @Test
    fun testGetData(){
        every { sharedPrefs.getString(LocalLocationDataStoreImpl.LONGITUDE_KEY,"0.0") } returns "10.23"
        every { sharedPrefs.getString(LocalLocationDataStoreImpl.LATITUDE_KEY,"0.0") } returns "14.3"
        val result = runBlocking { localStore.getLastLocation() }
        result shouldEqual  CurrentLocation(14.3,10.23)
    }
}