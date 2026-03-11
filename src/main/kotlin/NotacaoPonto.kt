package org.example

fun main() {
    val a: Int = 33.dec()
    val b: String = a.toString()

    println("Int: $a")
    println("Int: $b")
    println("O primeiro char da string b é: ${b.first()}")
}