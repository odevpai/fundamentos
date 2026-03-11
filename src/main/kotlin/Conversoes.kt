package org.example

fun main() {
    val a: Int = 1
    val b = a.toString()

    println(b + 1)

//    String para Int
    println("123".toInt() + 10)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)
    println("10".toIntOrNull())
}