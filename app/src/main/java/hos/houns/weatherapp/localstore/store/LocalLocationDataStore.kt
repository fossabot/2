package hos.houns.weatherapp.localstore.store

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import hos.houns.weatherapp.domain.entity.CurrentLocation
import hos.houns.weatherapp.domain.entity.CurrentWeatherUIModel
import hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LocalLocationDataStore(private var context: Context) {

    private val sharedPref: SharedPreferences by lazy {
        context.getSharedPreferences("WEATHER_PREFS", Context.MODE_PRIVATE)
    }

    suspend fun saveLastLocation(location: CurrentLocation) {
        withContext(Dispatchers.IO) {
            with(sharedPref.edit()) {
                putString(LATITUDE_KEY, location.latitude.toString())
                putString(LONGITUDE_KEY, location.longitude.toString())
                apply()
            }
        }
    }

    suspend fun getLastLocation(): CurrentLocation {
        return withContext(Dispatchers.IO) {
            CurrentLocation(
                sharedPref.getString(LATITUDE_KEY, "0.0")?.toDouble() ?: 0.0,
                sharedPref.getString(LONGITUDE_KEY, "0.0")?.toDouble() ?: 0.0
            )
        }
    }

    suspend fun saveCurrentWeather(weather: CurrentWeatherUIModel) {
        withContext(Dispatchers.IO) {
            sharedPref.edit().putString(CURRENT_WEATHER_KEY, Gson().toJson(weather)).apply()
        }
    }

    suspend fun getCurrentWeather(): CurrentWeatherUIModel {
        return withContext(Dispatchers.IO) {
            Gson().fromJson(
                sharedPref.getString(
                    CURRENT_WEATHER_KEY,
                    Gson().toJson(CurrentWeatherUIModel.EMPTY)
                ),
                CurrentWeatherUIModel::class.java
            )
        }
    }

    suspend fun saveForecastWeather(weather: List<ForecastWeatherUIModel>) {
        withContext(Dispatchers.IO) {
            sharedPref.edit().putString(FORECAST_KEY, Gson().toJson(weather)).apply()
        }
    }

    suspend fun getForecastWeather(): List<ForecastWeatherUIModel> {
        val type = object : TypeToken<List<ForecastWeatherUIModel>>() {}.type

        return withContext(Dispatchers.IO) {
            Gson().fromJson(
                sharedPref.getString(
                    FORECAST_KEY,
                    Gson().toJson(listOf(ForecastWeatherUIModel.EMPTY))
                ),
                type
            )
        }
    }

    suspend fun saveUpdateDate(date: String) {
        withContext(Dispatchers.IO) {
            sharedPref.edit().putString(UPDATED_DATE_KEY, date).apply()
        }
    }

    suspend fun getUpdatedDate(): String {
        return withContext(Dispatchers.IO) {
            sharedPref.getString(UPDATED_DATE_KEY, "") ?: ""
        }
    }


    companion object {
        const val LATITUDE_KEY = "LATITUDE_KEY"
        const val LONGITUDE_KEY = "LONGITUDE_KEY"
        const val CURRENT_WEATHER_KEY = "CURRENT_WEATHER_KEY"
        const val FORECAST_KEY = "FORECAST_KEY"
        const val UPDATED_DATE_KEY = "UPDATED_DATE_KEY"

    }

}