package hos.houns.weatherapp.remotestore

import com.google.gson.annotations.SerializedName
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import java.math.BigDecimal

interface OpenWeatherApi {
    @GET(CURRENT_WEATHER)
    suspend fun currentWeather(
        @Query("appid") appId: String = OPEN_WEATHER_API,
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("units") units: String=UNIT_METRIC
    ): CurrentWeatherResponse


    @GET(FORECAST_WEATHER)
    suspend fun forecastWeather(
        @Query("appid") appId: String = OPEN_WEATHER_API,
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("units") units: String=UNIT_METRIC,
        @Query("cnt") cnt: String= LIMIT,
        @Query("exclude") exclude: String= "current,minutely,hourly,alerts",
    ): ForecastResponse

    companion object {
        const val OPEN_WEATHER_API = "de101acfae21bbea418e3614631fcbeb"
        const val CURRENT_WEATHER = "weather"
        const val FORECAST_WEATHER = "onecall"
        const val UNIT_METRIC = "metric"
        const val LIMIT = "5"
        operator fun invoke(retrofit: Retrofit): OpenWeatherApi = retrofit.create(OpenWeatherApi::class.java)
    }
}



