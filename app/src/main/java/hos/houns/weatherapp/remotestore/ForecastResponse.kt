package hos.houns.weatherapp.remotestore

import com.google.gson.annotations.SerializedName

data class ForecastResponse(
    @SerializedName("daily") val daily : List<Daily>
) {

    data class Weather (
        @SerializedName("id") val id : Int,
    )

    data class Temp (
        @SerializedName("min") val min : Double,
        @SerializedName("max") val max : Double,
    )

    data class Daily (
        @SerializedName("dt") val dt : Long,
        @SerializedName("temp") val temp : Temp,
        @SerializedName("weather") val weather : List<Weather>,
    )

}