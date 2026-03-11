package org.example.classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: String)

fun main() {
    val g1 = Geladeira("LG", 4)
    val g2 = Geladeira("LG", 4)

    println(g1 == g2) //equals

    val t1 = Televisao("Samsung", "55'")
    val t2 = Televisao("Samsung", "55'")

    println(t1 == t2) //equals
    println(t1.toString())
    println(g1.toString())

//    Destructuring em data class
    val (marca, polegadas) = t1
    println("$marca $polegadas")
}