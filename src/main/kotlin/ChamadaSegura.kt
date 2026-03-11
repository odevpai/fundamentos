package org.example

fun main() {
    var a: Int? = null //safe call operator
    println(a?.dec())

//    Operador Elvis ?:
    println(a?.dec() ?: 0)

    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrao"

    println(obrigatorio)

//    Forcando NULL POINTER no kotlin
    var b: Int? = null
    println(b?.inc())

    println("Momento do erro...")
    println(b!!.inc())
}