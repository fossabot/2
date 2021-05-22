package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.entity.CurrentWeatherUIModel
import hos.houns.weatherapp.domain.entity.WeatherType
import hos.houns.weatherapp.remotestore.CurrentWeatherResponse
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.Test

internal class MapperCurrentWeatherResponseToUiModel {
    @Test
    fun test() {

        CurrentWeatherResponse(
            listOf(CurrentWeatherResponse.Weather(null, null)),
            CurrentWeatherResponse.Main(null, null, null, null, null, null),

            ).toUiModel().shouldEqual(CurrentWeatherUIModel(0, 0, 0, WeatherType.UNKNOW))

        CurrentWeatherResponse(
            listOf(CurrentWeatherResponse.Weather(0, "")),
            CurrentWeatherResponse.Main(0.0, 0.0, 0.0, 0.0, 0.0, 0.0),

            ).toUiModel().shouldEqual(CurrentWeatherUIModel(0, 0, 0, WeatherType.UNKNOW))

        CurrentWeatherResponse(
            listOf(CurrentWeatherResponse.Weather(800, "")),
            CurrentWeatherResponse.Main(0.0, 0.0, 0.0, 0.0, 0.0, 0.0),

            ).toUiModel().shouldEqual(CurrentWeatherUIModel(0, 0, 0, WeatherType.CLEAR))

        CurrentWeatherResponse(
            listOf(CurrentWeatherResponse.Weather(700, "")),
            CurrentWeatherResponse.Main(0.0, 0.0, 0.0, 0.0, 0.0, 0.0),

            ).toUiModel().shouldEqual(CurrentWeatherUIModel(0, 0, 0, WeatherType.ATMOSPHERE))
    }
}