package org.example.classes

var desconto: Double = 0.0

class ItemPedido(val nome: String, val preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemPedido(nome, preco)
//        @JvmStatic var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double = preco * (1 - desconto)
}

fun main() {
    val item1 = ItemPedido.create("Notebook", 1000.0)
    val item2 = ItemPedido("Celular", 500.0)
    desconto = 0.2
    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}