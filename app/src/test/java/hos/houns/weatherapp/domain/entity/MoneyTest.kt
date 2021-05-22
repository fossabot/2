package hos.houns.weatherapp.domain.entity

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MoneyTest{
    @Test
    fun test(){
        Assertions.assertEquals(Money("10","NGN").format().toString(),"10 NGN")
        Assertions.assertEquals(Money("10","KES").format().toString(),"10 KES")
    }
}