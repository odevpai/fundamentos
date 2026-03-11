package org.example.kotlin_in_action

import java.util.TreeMap

data class Person(val name: String,
                  val age: Int? = null)

val binaryReps = TreeMap<Char, String>()

fun main() {
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))

    val oldest = persons.maxBy{ it.age ?: 0 }

    println("The oldest is: $oldest")

//    for (c in 'a'..'z') println(
//        "${c.code} -> ${Integer.toBinaryString(c.code)}"
//    )

    for(c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps) println(
        "$letter -> $binary"
    )

    fun isLetter(c: Char) = c in 'A'..'Z'
    fun isDigit(c: Char) = c in '0'..'9'
    fun isWhitespace(c: Char) = c in ' ' downTo '\t' || c == '\n' || c == '\r'

    fun recognize(c: Char) = when(c) {
        in '0'..'9' -> "Its a digit"
        in 'A'..'Z' -> "Letra maiuscula"
        in 'a'..'z' -> "lowercase letter"
        else -> "other"
    }

}