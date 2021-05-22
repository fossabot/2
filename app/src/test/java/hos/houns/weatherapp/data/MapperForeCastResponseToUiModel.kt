package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel
import hos.houns.weatherapp.domain.entity.WeatherType
import hos.houns.weatherapp.remotestore.ForecastResponse
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MapperForeCastResponseToUiModel {

    @Test
    fun test() {
        ForecastResponse(
            listOf(
                ForecastResponse.Daily(
                    1621710380,
                    ForecastResponse.Temp(0.0, 0.0),
                    listOf(
                        ForecastResponse.Weather(800)
                    )
                )
            )
        ).toUiModel().shouldEqual(
            listOf(
                ForecastWeatherUIModel(0, WeatherType.CLEAR, "Saturday")
            )
        )
    }
}