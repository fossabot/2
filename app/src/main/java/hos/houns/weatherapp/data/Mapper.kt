package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.entity.CurrentWeatherUIModel
import hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel
import hos.houns.weatherapp.domain.entity.WeatherType
import hos.houns.weatherapp.remotestore.CurrentWeatherResponse
import hos.houns.weatherapp.remotestore.ForecastResponse
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.roundToInt

fun CurrentWeatherResponse?.toUiModel(): CurrentWeatherUIModel {
   return  CurrentWeatherUIModel(
        temp = (this?.main?.temp ?: 0.0).roundToInt(),
        tempMax = (
                this?.main?.temp_max ?: 0.0
                ).roundToInt(),
        tempMin = (
                this?.main?.temp_min ?: 0.0
                ).roundToInt(),
        type = (this?.weather?.first()?.id ?: 0).toWeatherType()
    )
}


fun ForecastResponse?.toUiModel(): List<ForecastWeatherUIModel> {
    return this?.daily?.map {
        ForecastWeatherUIModel(
            temp = it.temp?.max?.roundToInt()?:0,
            type = it.weather?.first()?.id?.toWeatherType()?: WeatherType.UNKNOW,
            day = it.dt?.toDateString()?:""
        )
    } ?: emptyList()
}

fun Int.toWeatherType( ): WeatherType {
    return when {
        this == 0 -> {
            WeatherType.UNKNOW
        }
        this.toString().startsWith("2") -> {
            WeatherType.THUNDERSTORM
        }
        this.toString().startsWith("3") -> {
            WeatherType.DRIZZLE
        }
        this.toString().startsWith("5") -> {
            WeatherType.RAINY
        }
        this.toString().startsWith("6") -> {
            WeatherType.SNOW
        }
        this.toString().startsWith("7") -> {
            WeatherType.ATMOSPHERE
        }
        this.toString() == "800" -> {
            WeatherType.CLEAR
        }
        this.toString().startsWith("80") -> {
            WeatherType.CLOUDY
        }
        else -> {
            WeatherType.SUNNY
        }
    }
}

fun Long.toDateString(): String {
    return SimpleDateFormat("EEEE", Locale.US).format(Date(this * 1000))
}

fun String.withDegree(): String {
    return this + 0x00B0.toChar()
}