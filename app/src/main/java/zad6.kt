package com.example.zadania
data class Wyniki(val idMecz: Int,
                  val nazwaGospodarz: String,
                  val punktyGospodarz: Int,
                  val nazwaGosc: String,
                  val punktyGosc: Int,
                    val punktyOgolne: Int = punktyGospodarz + punktyGosc
                )
fun main(){
    val tabelaLigi = mutableListOf<Wyniki>()

    tabelaLigi.add(Wyniki(1,"Barcelona",3,"Real Madryt",1))
    tabelaLigi.add(Wyniki(2,"Bayern Monachium",2,"Liverpool",2))
    tabelaLigi.add(Wyniki(3,"Manchester City",1,"Chelsea",0))
    tabelaLigi.add(Wyniki(4,"Juventus",2,"PSG",1))
    println("Wszystkie Mecze: ")
    tabelaLigi.forEach { println("${it.idMecz}.| ${it.nazwaGospodarz} ${it.punktyGospodarz} : ${it.nazwaGosc} ${it.punktyGosc}") }

    println("==============================================================")


}