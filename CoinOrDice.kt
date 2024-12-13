package com.example.a7zada
import kotlin.random.Random

class Coin{
    val a = Random.nextInt(1,3)
    val Reszka = "Moneta wybrala Reszke!!"
    val Orzel = "Moneta wybrala Orla"
    fun tailOrHead(){
        when(a){
            1 -> println(Reszka)
            2 -> println(Orzel)
            else -> println("Blad!!")
        }

    }
}
class Dice{

}

fun main(){
    println("Chcesz losowac kostka czy moneta(1-moneta, 2-kostka): ")
    val moneta1 = Coin()
    val wyborDiceOrCoin = readLine()!!.toInt()
    if(wyborDiceOrCoin == 1){
        moneta1.tailOrHead()
    }else if(wyborDiceOrCoin ==2){
        println("Dice")
    }
}