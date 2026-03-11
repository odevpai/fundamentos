package org.example.funcoes

fun relacaoTrabalho(chefe: String, funcionario: String) : String {
    return "$funcionario e subordinado(a) ao chefe: $chefe"
}

fun main() {
    println(relacaoTrabalho("Joao", "Maria"))
    println(relacaoTrabalho(funcionario = "Joao", chefe = "Maria"))
}