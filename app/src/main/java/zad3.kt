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

    println("Podaj autora książki: ")
    val author = readLine()!!.toString()
    println("Książki autora ${author}}")
    books.filter { it.author == author }.forEach { println(it.title) }

}