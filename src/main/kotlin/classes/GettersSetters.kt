package org.example.classes

class Cliente2 {
    constructor(nome: String) {
        this.nome = nome
    }
    var nome: String = ""
        get() = "Meu nome e ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anonimo"
            println("Novo nome: $value")
        }
}

fun main() {
    val cliente = Cliente2("")
    println(cliente.nome)
}