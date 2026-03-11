package org.example.funcoes

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun main() {
    println(min(10, 15))
}