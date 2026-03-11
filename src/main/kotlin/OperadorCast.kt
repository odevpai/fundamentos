package org.example

fun main() {
    val nota: Any = 9.3
    imprimirConceito(nota)
    imprimirConceito2(2)
}

fun imprimirConceito(nota: Any) {
    if (nota is Double) {
        println(
            when (nota) {
                in 9.0..10.0 -> "A"
                in 7.0..8.9 -> "B"
                in 4.0..6.9 -> "C"
                in 0.0..3.9 -> "D"
                else -> "E"
            }
        )
    }
}

fun imprimirConceito2(nota: Any) {
    when(nota as? Int) {
        in 9..10 -> println("A")
        in 7..8 -> println("B")
        in 4..6 -> println("C")
        in 0..3 -> println("D")
        else -> println("E")
    }
}