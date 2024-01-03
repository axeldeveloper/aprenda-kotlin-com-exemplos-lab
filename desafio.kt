// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)


data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel = Nivel.BASICO)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        if(!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("$usuario matriculado na formação $nome")
            println("O usuário ${usuario.nome} foi matriculado na formação $nome")
        } else {
            println("O ${usuario.nome} já está matriculado na formação $nome!")
        }
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val usuario1 = Usuario("Mateus")
    val usuario2 = Usuario("Alicia")

    val conteudo1 = ConteudoEducacional("Algoritmos em Kotlin")
    val conteudo2 = ConteudoEducacional("Orientação a objetos")

    val formacaoAndroid = Formacao("Desenvolvimento Android", listOf(conteudo1, conteudo2))

    formacaoAndroid.matricular(usuario1)
    formacaoAndroid.matricular(usuario1)
    formacaoAndroid.matricular(usuario2)

    println("Inscritos na formação: ${formacaoAndroid.nome}: ${formacaoAndroid.inscritos.map { it.nome }}")
}
