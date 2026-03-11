package org.example.lambdas

class Calculadora2{
    var resultado: Int = 0
    fun somar(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }

    fun add(valor: Int){
        resultado += valor
    }

}

fun main() {
    val calculadora = Calculadora2()
    calculadora.apply { somar(1, 2) }.apply { add(3) }.apply { println(resultado) }

    calculadora.apply {
        somar(1, 2)
        add(10)
        println(resultado)
    }

//    inline function
    with(calculadora) {
        somar(1, 2)
        add(10)
        println(resultado)
    }
}