package hos.houns.weatherapp.domain.entity

import java.util.*

class Money (private val binaryAmount:String, private val currency: String){

    /*init {
        require(binaryAmout.isNotBlank() && currency.isNotBlank()){
           "The amount and the currency should not be empty"
        }
    }*/

    fun format(): StringBuilder = StringBuilder().append(binaryAmount).append(" ")
        .append(currency.toUpperCase(Locale.getDefault()))
}