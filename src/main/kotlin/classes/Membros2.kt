package org.example.classes

class Calculadora {
    private var resultado: Int = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(vararg valores: Int): Calculadora {
        valores.forEach { resultado *= it }
        return this
    }

    fun print() = println(
        "Resultado: $resultado"
    )
}

fun main() {
    val calculadora = Calculadora()
    calculadora.somar(1,2,3,4,).multiplicar(2,4).print()
}