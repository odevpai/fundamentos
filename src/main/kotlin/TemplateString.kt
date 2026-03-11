package org.example

fun main() {
    val aprovados = listOf("Joao", "Maria", "Pedro")
    println("O primeiro colocado foi ${aprovados[0]}.")

    val bomHumor = false

    println("Hoje estou ${if (bomHumor) "feliz" else "chateado"}.")
}