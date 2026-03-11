package org.example.funcoes

inline fun transacao(funcao: () -> Unit) {
    println("abrindo transacao...")
    try {
        funcao()
    } finally {
        println("fechando transacao...")
    }
}

fun main() {
    transacao {
        println("executando...")
    }
}