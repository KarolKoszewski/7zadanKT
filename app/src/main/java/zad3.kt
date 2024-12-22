package com.example.zadania
data class Book(val title: String, val author: String, val year: Int)

fun main() {
    val books = mutableListOf<Book>()


    books.add(Book("Władca Pierścieni", "J.R.R. Tolkien", 1954))
    books.add(Book("1984", "George Orwell", 1949))
    books.add(Book("Zbrodnia i kara", "Fyodor Dostoevsky", 1866))
    books.add(Book("Mistrz i Małgorzata", "Michaił Bułhakow", 1966))



}