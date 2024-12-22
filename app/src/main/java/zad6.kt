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
    println("FILTROWANIE!")

    val najlepszyMecz = tabelaLigi.maxByOrNull { it.ocena }
    println("Mecz z najwyższą oceną: ")
    println("${najlepszyMecz?.idMecz}.| ${najlepszyMecz?.nazwaGospodarz} ${najlepszyMecz?.punktyGospodarz} : ${najlepszyMecz?.nazwaGosc} ${najlepszyMecz?.punktyGosc}, Ocena: ${najlepszyMecz?.ocena}")
    println("")

    val najgorszyMecz = tabelaLigi.minByOrNull { it.ocena }
    println("Mecz z najniższą oceną: ")
    println("${najgorszyMecz?.idMecz}.| ${najgorszyMecz?.nazwaGospodarz} ${najgorszyMecz?.punktyGospodarz} : ${najgorszyMecz?.nazwaGosc} ${najgorszyMecz?.punktyGosc}, Ocena : ${najgorszyMecz?.ocena}")
    println("")

    val roznica = najlepszyMecz?.ocena!! - najgorszyMecz?.ocena!!
    println("Różnica ocen między najlepszym a najgorszym meczem: ${roznica}")
    println("========================================")

    println("Mecz powyżej jakiej oceny chcesz zobaczyć?")
    val ocena = readLine()!!.toInt()
    println("========================================")

    println("Mecze powyżej oceny $ocena:")
    tabelaLigi.filter { it.ocena > ocena }.forEach { println("${it.idMecz}.| ${it.nazwaGospodarz} ${it.punktyGospodarz} : ${it.nazwaGosc} ${it.punktyGosc}, Ocena: ${it.ocena}") }
    println("========================================")

    val suma = tabelaLigi.sumOf { it.ocena }
    println("Suma ocen wszystkich meczów: ${suma}")
    println("")
    println("========================================")



}