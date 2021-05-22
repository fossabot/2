package hos.houns.weatherapp.domain.entity

data class FavoriteUiModel(val id: String,
                           val label:String,
                           val latitude:Double,
                           val longitude:Double){
    companion object{
        val EMPTY= FavoriteUiModel("","",0.0,0.0)
    }
}
