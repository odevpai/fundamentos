package org.example.lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Livro", 29.90),
    Produto("Caderno", 19.90),
    Produto("Borracha", 4.90),
    Produto("Caneta", 1.90)
)

fun main() {
    val totalizar = {total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map(Produto::preco).reduce(totalizar)
    println(precoTotal)
}