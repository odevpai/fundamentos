package org.example.lambdas

fun main() {
    val soma = { x: Int, y: Int -> x + y }
    println(soma(2, 3))
}