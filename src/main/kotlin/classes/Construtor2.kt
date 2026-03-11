package org.example.classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2("Matrix", 2000, "Acao")
    println("${filme.nome} foi lancado em ${filme.anoLancamento}")
}