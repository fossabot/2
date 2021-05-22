package hos.houns.weatherapp.domain.entity

data class Country(val label:String,
                   val currency:String,
                   val phonePrefix: Int,
                   val phoneNumberLenght:Int,
                    val phoneNumberFormat:String){
    override fun toString(): String = label
}


val countries = listOf(
     Country("Kenya",Currency.KES.name, 254,9,"### ######"),
     Country("Nigeria",Currency.NGN.name, 234,7,"### ####"),
     Country("Tanzania",Currency.TZS.name, 255,9,"### ######"),
     Country("Uganda",Currency.UDX.name, 256,7,"### ####")
)

enum class Currency{ KES, NGN, TZS,UDX}
