package hos.houns.weatherapp.domain.entity

data class ForecastWeatherUIModel(val temp: Int,
                                  val type:WeatherType,
                                  val day:String){
    companion object{
        val EMPTY = ForecastWeatherUIModel(0,WeatherType.UNKNOW,"")
    }
}
