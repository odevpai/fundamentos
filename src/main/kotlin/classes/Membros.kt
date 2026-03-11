package org.example.classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar() = "$dia/$mes/$ano"
}

fun main() {
    val nascimento = Data(10, 10, 1990)
    println(nascimento.formatar())
}