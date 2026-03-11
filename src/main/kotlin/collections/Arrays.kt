package org.example.collections

fun main() {
    val numeros = Array(10) { i -> i * 10}
    for (numero in numeros) println(numero)

    println(numeros[1])
}