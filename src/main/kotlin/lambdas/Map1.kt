package org.example.lambdas

fun main() {
    val alunos = arrayListOf("Pedro", "Tiago", "Maria")
    alunos.forEach { println(it) }
    println("--------------------------")

    alunos.map { it.uppercase() }.forEach(::println)

    println("------------EXEMPLO THIS--------------")
    alunos.map{it.uppercase()}.apply { println(this) }
}