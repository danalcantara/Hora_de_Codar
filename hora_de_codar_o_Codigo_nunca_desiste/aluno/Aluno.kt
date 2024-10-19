package aluno
data class Aluno(
    val nome: String,
    val notas: List<Double>
) {
    fun media(): Double {
        return notas.average()
    }

    fun situacao(): String {
        return if (media() >= 5) "Aprovado" else "Reprovado"
    }
}

fun main() {
    val alunos = mutableListOf<Aluno>()
    var opcao: Int

    do {
        println("\nMenu:")
        println("1. Cadastrar Aluno")
        println("2. Pesquisar Aluno")
        println("3. Apresentar Todos os Registros")
        println("4. Sair")
        print("Escolha uma opção: ")
        opcao = readln().toInt()

        when (opcao) {
            1 -> {
                if (alunos.size < 20) {
                    print("Nome do Aluno: ")
                    val nome = readln()
                    val notas = mutableListOf<Double>()

                    for (i in 1..4) {
                        print("Nota bimestral $i: ")
                        notas.add(readln().toDouble())
                    }
                    alunos.add(Aluno(nome, notas))
                    alunos.sortBy { it.nome } // Classifica por nome
                } else {
                    println("Número máximo de alunos cadastrados!")
                }
            }
            2 -> {
                print("Digite o nome do aluno para pesquisar: ")
                val nomeBusca = readln()
                val alunoEncontrado = alunos.find { it.nome.equals(nomeBusca, ignoreCase = true) }
                if (alunoEncontrado != null) {
                    println("Aluno encontrado: ${alunoEncontrado.nome}")
                    println("Notas: ${alunoEncontrado.notas}")
                    println("Média: ${alunoEncontrado.media()}")
                    println("Situação: ${alunoEncontrado.situacao()}")
                } else {
                    println("Aluno não encontrado.")
                }
            }
            3 -> {
                if (alunos.isEmpty()) {
                    println("Nenhum aluno cadastrado.")
                } else {
                    println("Registros de Alunos:")
                    for (aluno in alunos) {
                        println("${aluno.nome} - Notas: ${aluno.notas} - Média: ${aluno.media()} - Situação: ${aluno.situacao()}")
                    }
                }
            }
            4 -> {
                println("Saindo do programa...")
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    } while (opcao != 4)
}