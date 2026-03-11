package org.example.classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main() {
    val produto = Produto("Notebook", 1000.0, 0.1, true)
    println(produto.precoComDesconto)

    val produto2 = Produto("Celular", 500.0, 0.2, false)
    println("${produto2.nome}\n\tDe: R$ ${produto2.preco}\n\tCom Desconto: R$ ${produto2.precoComDesconto}")

    if (produto2.inativo) {
        produto2.preco = 0.0
        println("Depois de inativo: R$ ${produto2.precoComDesconto}")
    }

}