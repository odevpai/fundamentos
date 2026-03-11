package org.example.controles

fun main() {
    var opcao: Int = -1
    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voce escolheu a opcao $opcao")
    } while (opcao != -1)
    println("Ate a proxima!")
}