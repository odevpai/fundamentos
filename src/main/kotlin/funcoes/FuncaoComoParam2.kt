package org.example.funcoes

fun <E> filtrar(lista: List<E>, predicado: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()
    for (elemento in lista) {
        if (predicado(elemento)) listaFiltrada.add(elemento)
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean = nome.length == 3

fun main() {
    val nomes = listOf("Ana", "Bia", "Carlos", "Daniela")
    val nomesComTresLetras = filtrar(nomes, ::comTresLetras)
    println(nomesComTresLetras.joinToString(","))
}