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
    val b = Random.nextInt(1,7)
    val jeden = "Liczba oczek 1"
    val dwa = "Liczba oczek 2"
    val trzy = "Liczba oczek 3"
    val cztery = "Liczba oczek 4"
    val piec = "Liczba oczek 5"
    val szesc = "Liczba oczek 6"

    fun rzutKostka(){
        when(b){
            1 -> println(jeden)
            2 -> println(dwa)
            3 -> println(trzy)
            4 -> println(cztery)
            5 -> println(piec)
            6 -> println(szesc)
        }
    }

}

fun main(){
    println("Chcesz losowac kostka czy moneta(1-moneta, 2-kostka): ")
    val moneta1 = Coin()
    val kostka1 = Dice()
    val wyborDiceOrCoin = readLine()!!.toInt()
    if(wyborDiceOrCoin == 1){
        moneta1.tailOrHead()
    }else if(wyborDiceOrCoin ==2){
        kostka1.rzutKostka()
    }
}
