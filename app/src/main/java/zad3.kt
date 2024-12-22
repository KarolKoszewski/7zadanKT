package com.example.zadania
data class Book(val title: String, val author: String, val year: Int)

fun main() {
    val books = mutableListOf<Book>()


    books.add(Book("Władca Pierścieni", "J.R.R. Tolkien", 1954))
    books.add(Book("1984", "George Orwell", 1949))
    books.add(Book("Zbrodnia i kara", "Fyodor Dostoevsky", 1866))
    books.add(Book("Mistrz i Małgorzata", "Michaił Bułhakow", 1966))
    println("Wszystkie książki:")
    books.forEach { println("${it.title} by ${it.author}, Year: ${it.year}") }

    println("==============================================================")

    println("Czy chcesz dodać nową książkę?(1-tak, 2-nie)")
    val addBook = readLine()!!.toInt()

    if(addBook == 2){

        println("Podaj autora książki: ")
        val author = readLine()!!.toString()
        println("Książki autora ${author}}")
        books.filter { it.author == author }.forEach { println(it.title) }

        println("Podaj rok wydania książki: ")
        val y = readLine()!!.toInt()
        println("Książki wydane w ${y} roku:")
        books.filter { it.year == y }.forEach { println(it.title) }

        println("Książki posortowane alfabetycznie:")
        books.sortedBy { it.title }.forEach { println(it.title) }

    }else if(addBook == 1){
        println("Podaj tytuł książki: ")
        val title = readLine()!!.toString()

        println("Podaj autora książki: ")
        val author = readLine()!!.toString()

        println("Podaj rok wydania książki: ")
        val year = readLine()!!.toInt()

        books.add(Book(title, author, year))
        println("Wszystkie książki:")
        books.forEach { println("${it.title} by ${it.author}, Year: ${it.year}") }
    }

}