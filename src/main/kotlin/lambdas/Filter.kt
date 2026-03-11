package org.example.lambdas

data class Aluno(val nome: String, val nota: Double)

fun main() {
    val alunos = listOf(
        Aluno("João", 8.5),
        Aluno("Maria", 7.0),
        Aluno("Pedro", 9.2),
        Aluno("Ana", 6.8)
    )

    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
    println("Alunos aprovados:")
    aprovados.forEach { println("${it.nome} - Nota: ${it.nota}") }
}