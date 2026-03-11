package org.example.operadores

fun main() {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = true

    if (executouTrabalho1 && executouTrabalho2) {
        println("Os dois trabalhos foram executados.")
    } else if (executouTrabalho1 || executouTrabalho2) {
        println("Um dos trabalhos foi executado.")
    } else {
        println("Nenhum trabalho foi executado.")
    }

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println("Comprou sorvete? $comprouSorvete")
    println("Comprou tv 50\"? $comprouTv50")
    println("Comprou tv 32\"? $comprouTv32")
}