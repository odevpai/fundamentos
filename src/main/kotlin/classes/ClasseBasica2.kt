package org.example.classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nome: String) {
    val nomeIni: String = nome
}

fun main() {
    val pessoa = Pessoa3("Maria")
    println(pessoa.nomeIni)
}
