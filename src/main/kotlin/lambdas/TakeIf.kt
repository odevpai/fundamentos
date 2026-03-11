package org.example.lambdas

fun main() {
    println("Digite sua mensage: ")

    val entrada = readLine()
    val mensagem = entrada.takeIf { it != "" } ?: "Sem mensagem"

    println(mensagem)
}