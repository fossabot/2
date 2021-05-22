package hos.houns.weatherapp.domain.entity

data class CurrentWeatherUIModel(val temp: Int,
                                 val tempMin:Int,
                                 val tempMax:Int,
                                 val type:WeatherType){
    companion object{
        val EMPTY = CurrentWeatherUIModel(0,0,0,WeatherType.CLOUDY)
    }
}
