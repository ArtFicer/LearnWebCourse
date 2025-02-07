/** You can edit, run, and share this code. play.kotlinlang.org */

// Explicação do código no readme.md na pasta "/Herança"

open class Eletronico(var marca: String) {
    fun ligar() {
        println("Ligando")
    }
    fun desligar() {
        println("Desligando")
    }
}

class Computador(marca: String) : Eletronico(marca) {
    fun processar() {
        println("Estou processando algo...")
    }
}

fun main() {
    var computador: Computador = Computador("Dell")

    computador.ligar()
    computador.processar()
    computador.desligar()
}
