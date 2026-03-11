package org.example.classes

class Filme3(nome: String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme3("Matrix", 2000, "Acao")
    println("${filme.nome} foi lancado em ${filme.anoLancamento}")
}