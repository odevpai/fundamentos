package org.example.lambdas

fun main() {
    val lista = listOf(5, 2, 8, 1, 9, 3)

    val ordenadaPorValor = lista.sortedBy { it }
    println("Ordenada por valor: $ordenadaPorValor")

    val ordenadaPorIndice = lista.sortedBy { lista.indexOf(it) }
    println("Ordenada por indice: $ordenadaPorIndice")

    val listaDeNomes = listOf("Bob", "Alice", "Washington", "David", "Eve")
    val ordenadaPorNome = listaDeNomes.sortedBy { it }
    println("Ordenada por nome: $ordenadaPorNome")

}