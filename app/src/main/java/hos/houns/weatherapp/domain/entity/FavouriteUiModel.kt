package hos.houns.weatherapp.domain.entity

data class FavouriteUiModel(val id: String,
                            val label:String,
                            val latitude:Double,
                            val longitude:Double){
    companion object{
        val EMPTY= FavouriteUiModel("","",0.0,0.0)
    }
}
