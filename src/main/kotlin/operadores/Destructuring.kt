package org.example.operadores

fun main() {
    val (a, b) = Pair(3, 5)
    println("a = $a e b = $b")

    val (marca, modelo) = Carro("Ford", "Fusion")
    println("A $modelo de $marca foi fabricado!")

    val (_, _, terceiroLugar) = listOf(
        "Corinthians",
        "Palmeiras",
        "Santos"
    )

    println(terceiroLugar)

}

data class Carro(val marca: String, val modelo: String)