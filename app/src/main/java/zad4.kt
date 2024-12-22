package com.example.a7zdadn

data class Miasto(val nazwa: String)

interface Weather{
    fun main()
}
data class Sunny(val temperatura: Int) :Weather
{
    override fun main(){
        println("Słonecznie, temperatura $temperatura stopni")
    }
}
data class Rainy(val opady: Int) :Weather {
    override fun main() {
        println("Deszczowo, opady $opadymm")
    }
}
data class Cloudy(val zachmurzenie: Int) :Weather {
    override fun main() {
        println("Zachmurzenie $zachmurzenie%")
    }
}

fun main (){

        }