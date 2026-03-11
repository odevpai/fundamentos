package org.example.classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
    val local = "Fulano"
    println("$diretamenteNoArquivo, $local!")
}

class Coisa {
    var variaavelDeInstancia: String = "Boa noite"

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano"
    }

    fun fazer() {
        val local: Int = 7

        if (local > 3) {
            println("$variaavelDeInstancia, $constanteDeClasse, $local e $diretamenteNoArquivo")
        }
    }

}

fun main() {
    topLevel()
    val coisa = Coisa()
    Coisa().fazer()
    println(coisa.variaavelDeInstancia)
    println(Coisa.constanteDeClasse)
}