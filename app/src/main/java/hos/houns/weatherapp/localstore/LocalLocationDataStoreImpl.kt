package hos.houns.weatherapp.localstore

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import hos.houns.weatherapp.data.LocalLocationDataStore
import hos.houns.weatherapp.domain.entity.CurrentLocation
import hos.houns.weatherapp.domain.entity.CurrentWeatherUIModel
import hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel

class LocalLocationDataStoreImpl(private var context: Context) : LocalLocationDataStore {

    private val sharedPref: SharedPreferences by lazy {
        context.getSharedPreferences("WEATHER_PREFS", Context.MODE_PRIVATE)
    }

    override suspend fun saveLastLocation(location: CurrentLocation) {
        with(sharedPref.edit()) {
            putString(LATITUDE_KEY, location.latitude.toString())
            putString(LONGITUDE_KEY, location.longitude.toString())
            apply()
        }
    }

    override suspend fun getLastLocation(): CurrentLocation {
        return CurrentLocation(
            sharedPref.getString(LATITUDE_KEY, "0.0")?.toDouble() ?: 0.0,
            sharedPref.getString(LONGITUDE_KEY, "0.0")?.toDouble() ?: 0.0
        )
    }

    override suspend fun saveCurrentWeather(weather: CurrentWeatherUIModel) {
        sharedPref.edit().putString(CURRENT_WEATHER_KEY, Gson().toJson(weather)).apply()
    }

    override suspend fun getCurrentWeather(): CurrentWeatherUIModel {
        return Gson().fromJson(
            sharedPref.getString(CURRENT_WEATHER_KEY, Gson().toJson(CurrentWeatherUIModel.EMPTY)),
            CurrentWeatherUIModel::class.java
        )
    }

    override suspend fun saveForecastWeather(weather: List<ForecastWeatherUIModel>) {
        sharedPref.edit().putString(FORECAST_KEY, Gson().toJson(weather)).apply()
    }

    override suspend fun getForecastWeather(): List<ForecastWeatherUIModel> {
        val type = object : TypeToken<List<ForecastWeatherUIModel>>() {}.type

        return Gson().fromJson(
            sharedPref.getString(FORECAST_KEY, Gson().toJson(listOf(ForecastWeatherUIModel.EMPTY))),
            type
        )
    }

    override suspend fun saveUpdateDate(date: String) {
        sharedPref.edit().putString(UPDATED_DATE_KEY, date).apply()
    }

    override suspend fun getUpdatedDate(): String {
        return sharedPref.getString(UPDATED_DATE_KEY, "") ?: ""
    }


    companion object {
        const val LATITUDE_KEY = "LATITUDE_KEY"
        const val LONGITUDE_KEY = "LONGITUDE_KEY"
        const val CURRENT_WEATHER_KEY = "CURRENT_WEATHER_KEY"
        const val FORECAST_KEY = "FORECAST_KEY"
        const val UPDATED_DATE_KEY = "UPDATED_DATE_KEY"

    }

}