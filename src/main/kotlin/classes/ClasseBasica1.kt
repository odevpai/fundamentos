package org.example.classes

class Cliente {
    var nome: String = ""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "Maria Helena"
    println("O cliente e ${cliente.nome}")
}
