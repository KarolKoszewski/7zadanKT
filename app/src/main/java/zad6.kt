package com.example.zadania
data class Wyniki(val idMecz: Int,
                  val nazwaGospodarz: String,
                  val punktyGospodarz: Int,
                  val nazwaGosc: String,
                  val punktyGosc: Int,
                  var ocena : Int
                )
fun main(){
    val tabelaLigi = mutableListOf<Wyniki>()

    tabelaLigi.add(Wyniki(1,"Barcelona",3,"Real Madryt",1,0))
    tabelaLigi.add(Wyniki(2,"Bayern Monachium",2,"Liverpool",2,0))
    tabelaLigi.add(Wyniki(3,"Manchester City",1,"Chelsea",0,0))
    tabelaLigi.add(Wyniki(4,"Juventus",2,"PSG",1,0))
    println("Wszystkie Mecze: ")
    tabelaLigi.forEach { println("${it.idMecz}.| ${it.nazwaGospodarz} ${it.punktyGospodarz} : ${it.nazwaGosc} ${it.punktyGosc}") }

    println("========================================")

    for (mecz in tabelaLigi) {
        println("Mecz nr ${mecz.idMecz} | ${mecz.nazwaGospodarz} ${mecz.punktyGospodarz} : ${mecz.nazwaGosc} ${mecz.punktyGosc}")
        println("Jaką ocenę przeznaczasz dla tego meczu? (0-100)")
        val ocena1 = readLine()?.toIntOrNull()

        if (ocena1 != null && ocena1 in 0..100) {
            mecz.ocena = ocena1
            println("Ocena została zapisana.")
        } else {
            println("Nieprawidłowa ocena. Wprowadź liczbę z zakresu 0-100.")
        }
        println("========================================")
    }

    println("Wszystkie mecze z ocenami:")
    tabelaLigi.forEach { println("${it.idMecz}.| ${it.nazwaGospodarz} ${it.punktyGospodarz} : ${it.nazwaGosc} ${it.punktyGosc}, Ocena: ${it.ocena}") }

    println("========================================")

    println("czy chcesz dalej przeglądać mecze??")

}