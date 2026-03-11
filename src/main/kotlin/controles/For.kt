package org.example.controles

fun main() {
    for (i in 1..10) {println(i)}
    for (i in 10 downTo 1) {println(i)}
    println("Com STEP...")
    for (i in 1..100 step 2) {println(i)}
    for (i in 100 downTo 1 step 5) {println(i)}

    val alunos = arrayListOf("Andre", "Carlos", "Maria", "Bruna")
    for (aluno in alunos) {println(aluno)}

    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }

    alunos.forEach { println("IT..." + it) }
    alunos.forEachIndexed { i, aluno -> println("${i + 1} - $aluno")}

}