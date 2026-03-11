package org.example.controles

fun main() {
    val nota: Double = 7.0
    if (nota >= 7) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }

//    IF ELSE 2
    val num1: Int = 2
    val num2: Int = 3

    val maiorValor = if (num1 > num2) {
        println("processando...")
        num1
    } else {
        println("processando...")
        num2
    }

    val maiorValor2 = if (num1 > num2) num1 else num2

    println("O maior valor eh $maiorValor")
    println("O maior valor eh $maiorValor2")

//    OPERADOR RANGE

    val nota2: Double = 9.5

//    usando o operador range
    if (nota2 in 9.0..10.0) {
        println("Aprovado")
    } else if (nota2 in 7.0..8.9) {
        println("Reprovado")
    }

}