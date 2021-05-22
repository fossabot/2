package hos.houns.weatherapp.data

import hos.houns.weatherapp.domain.entity.WeatherType
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MapperIntToWeatherType{
    @Test
    fun test(){

        0.toWeatherType().shouldEqual(   WeatherType.UNKNOW)
        2.toWeatherType().shouldEqual(   WeatherType.THUNDERSTORM)
        3.toWeatherType().shouldEqual(   WeatherType.DRIZZLE)
        5.toWeatherType().shouldEqual(   WeatherType.RAINY)
        0.toWeatherType().shouldEqual(   WeatherType.UNKNOW)
        6.toWeatherType().shouldEqual(   WeatherType.SNOW)
        7.toWeatherType().shouldEqual(   WeatherType.ATMOSPHERE)
        800.toWeatherType().shouldEqual(   WeatherType.CLEAR)
        80.toWeatherType().shouldEqual(   WeatherType.CLOUDY)
        90.toWeatherType().shouldEqual(   WeatherType.SUNNY)


    }
}