package org.example.collections

fun main() {
    val numeros = arrayListOf(1, 2, 3)
    val strings = arrayListOf("a", "b", "c")
    val uniao = numeros + strings

    for (n in uniao) println(n)
}