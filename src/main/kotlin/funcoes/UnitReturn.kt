package org.example.funcoes

fun imprimirMaior(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimirMaior2(a: Int, b: Int) = println(Math.max(a, b))

fun imprimirMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

fun main() {
    imprimirMaior(10, 20)
}