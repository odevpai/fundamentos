package org.example.funcoes

inline fun <T> executarComLog(nomeFunction: String, funcao: () -> T): T {
    println("Iniciando $nomeFunction...")
    return funcao()
}

fun somar(a: Int, b: Int) = a + b

fun main() {
    println(somar(1, 2))

    val resultado = executarComLog("Somar") { somar(1, 2) }
    println(resultado)

}