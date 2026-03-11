package org.example.controles

fun main() {
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }

    externo@for (i in 1..10) {
        for (j in 1..10) {
            if (i == 5 && j == 5) {
                break@externo
            }
            println("$i - $j")
        }
    }
}