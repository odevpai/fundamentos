package org.example.classes

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String) {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme("Matrix", 2000, "Acao")
    println("${filme.nome} foi lancado em ${filme.anoLancamento}")
}