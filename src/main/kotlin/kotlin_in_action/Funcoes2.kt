package org.example.kotlin_in_action

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    return result.append(postfix).toString()
}

var opCount = 0

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}

fun String.lastChar(): Char = get(length - 1)

fun main() {
    val list = listOf(1, 2, 3)
    println(joinToString(list, separator = "; ", prefix = "(", postfix = ")"))
    println(joinToString(list))
//    println(joinToString(list, suffix = ";", prefix = "#"))

    println("Kotlin".lastChar())

}