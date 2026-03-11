package org.example.funcoes

fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

fun main() {
    for (n in ordenar(1, 5, 3, 2, 4)) println(n)
}