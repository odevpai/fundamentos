package org.example.operadores

fun main() {
    val nota: Double = 8.0
    val resultado: String = if (nota >= 7.0) "Aprovado" else "Reprovado"
    println(resultado)

    obterResultado(5.0)
}

fun obterResultado(nota: Double) = if (nota >= 7.0) println("Aprovado") else println("Reprovado")