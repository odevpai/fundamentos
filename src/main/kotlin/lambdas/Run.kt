package org.example.lambdas

data class Casa(var endereco: String = "", var numero: Int = 0)

fun main() {
    val casa = Casa()
    casa.run {
        endereco = "Rua ABC"
        numero = 123 }
    println(casa)
}