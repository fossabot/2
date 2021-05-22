package hos.houns.weatherapp.remotestore

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("weather") val weather: List<Weather>?,
    @SerializedName("main") val main: Main?,
) {

    data class Weather(
        @SerializedName("id") val id: Int?,
        @SerializedName("main") val main: String?
    )

    data class Main(
        @SerializedName("temp") val temp: Double?,
        @SerializedName("feels_like") val feels_like: Double?,
        @SerializedName("temp_min") val temp_min: Double?,
        @SerializedName("temp_max") val temp_max: Double?,
        @SerializedName("pressure") val pressure: Double?,
        @SerializedName("humidity") val humidity: Double?
    )

}
