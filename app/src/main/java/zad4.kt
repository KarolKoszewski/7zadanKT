package com.example.a7zdadn

data class Miasto(val nazwa: String)

interface Weather{
    fun wyswietlPogode(miasto: Miasto)
}
data class Sunny(val temperatura: Int) :Weather
{
    override fun wyswietlPogode(miasto: Miasto){
        println("${miasto.nazwa} Słonecznie, temperatura $temperatura stopni")
    }
}
data class Rainy(val opady: Int) :Weather {
    override fun wyswietlPogode(miasto: Miasto) {
        println("${miasto.nazwa} Deszczowo, opady {$opady}mm")
    }
}
data class Cloudy(val zachmurzenie: Int) :Weather {
    override fun wyswietlPogode(miasto: Miasto) {
        println("${miasto.nazwa} Zachmurzenie $zachmurzenie%")
    }
}
val miasta= listOf(
    Miasto("Warszawa"),
    Miasto("Kraków"),
    Miasto("Wrocław"),
    Miasto("Poznań"),
    Miasto("Gdańsk"),
)
val danePogodowe= mapOf(
    miasta[0] to Sunny(25),
    miasta[1] to Rainy(6),
    miasta[2] to Cloudy(30),
    miasta[3] to Sunny(28),
    miasta[4] to Rainy(5),
)

fun wyswietlPogode (miasto: Miasto){
    val pogoda = danePogodowe[miasto]
    if (pogoda != null) {
        pogoda.wyswietlPogode(miasto)
    } else {
        println("Brak danych pogodowych dla miasta $miasto")
    }
}
fun main (){
    wyswietlPogode(miasta[4])
}