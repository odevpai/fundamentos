package org.example.funcoes

fun potencia(base: Int = 2, expoente: Int = 1): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}

fun teste(nome: String) {
    println(nome)
}

fun main() {
    println(potencia(10, 2))
    println(potencia(10))
    println(potencia(expoente = 10))
    teste("Edson")
}