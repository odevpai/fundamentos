package org.example.funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main() {
    val produto1 = Produto("Notebook", 1000.0)
    val produto2 = Produto("Celular", 500.0)

    println(produto1 maisCaroQue produto2)
}