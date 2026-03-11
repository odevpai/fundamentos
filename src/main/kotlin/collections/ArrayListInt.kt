package org.example.collections

fun main() {
    val pares = arrayListOf(2, 4, 6, 8)
    val impares = intArrayOf(1, 3, 5, 7)
    pares.forEach(::println)
    println("-----------------------------------")
    for (n in impares.union(pares).sorted()) println(n)
}