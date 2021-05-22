package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.*
import java.math.BigDecimal

interface LocalLocationDataStore {
    suspend fun saveLastLocation( location: CurrentLocation)
    suspend fun getLastLocation (): CurrentLocation

    suspend fun saveCurrentWeather(weather: CurrentWeatherUIModel)
    suspend fun getCurrentWeather():CurrentWeatherUIModel

    suspend fun saveForecastWeather(weather: List<ForecastWeatherUIModel>)
    suspend fun getForecastWeather():List<ForecastWeatherUIModel>

    suspend fun saveUpdateDate(date:String)
    suspend fun getUpdatedDate():String

}