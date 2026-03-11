package org.example.controles

fun main() {
    val nota = 10

    when(nota) {
        10, 9 -> print("Fantastico")
        8, 7 -> print("Parabens")
        6,5,4 -> print("Tem como recuperar")
        in 0..3 -> print("Te vejo no proximo semestre")
        else -> print("Nota invalida")
    }
}