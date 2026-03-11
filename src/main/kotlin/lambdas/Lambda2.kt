package org.example.lambdas

interface Operacao {
    fun executar(a: Int, b: Int ): Int
}

class Multiplicacao : Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora{
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }

    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a, b)
    }

    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

//fun main() {
//    val calculadora = Calculadora()
//    println(calculadora.calcular(10, 20, Multiplicacao()))
//
//    val subtracao = { x: Int, y: Int -> x - y }
//    println(calculadora.calcular(10, 20, subtracao))
//}

typealias OperacaoLambda = (Int, Int) -> Int

//Testando OperacaoLambda
fun main() {
    val soma: OperacaoLambda = { x, y -> x + y }
    val subtracao: OperacaoLambda = { x, y -> x - y }
    val multiplicacao: OperacaoLambda = { x, y -> x * y }

//    Usando as operations
    println("Soma: ${soma(10, 20)}")
    println("Subtracao: ${subtracao(10, 20)}")
    println("Multiplicacao: ${multiplicacao(10, 20)}")

//    Passando como param
    calcular(10, 20, soma)
    calcular(10, 20, subtracao)
    calcular(10, 20, multiplicacao)
}

fun calcular(a: Int, b: Int, operacao: OperacaoLambda): Int {
    val resultado = operacao(a, b)
    println("Resultado = $resultado")
    return resultado
}