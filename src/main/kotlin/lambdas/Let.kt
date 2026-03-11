package org.example.lambdas

fun main() {
    val listWithNulls: List<String?> = listOf("a", null, "b")
    listWithNulls.let { println(it) }

    println("--------------------------")

    for (item in listWithNulls) {
        item?.let { println(it) }
    }
}