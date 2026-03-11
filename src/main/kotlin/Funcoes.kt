package org.example

fun imprimirSoma(a: Int, b: Int) {
    println(a + b)
}

fun soma(a: Int, b: Int) = println(a + b)

fun soma2(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    imprimirSoma(10, 20)
    soma(10, 20)
    println(soma2(10, 20))
}