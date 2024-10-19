package nomealtura

data class Pessoa(
    val nome: String,
    val altura: Double
)

fun main() {
    val pessoas = mutableListOf<Pessoa>()
    var opcao: Int

    do {
        println("\nMenu:")
        println("1. Cadastrar Pessoa")
        println("2. Apresentar Pessoas <= 1.5m")
        println("3. Apresentar Pessoas > 1.5m")
        println("4. Apresentar Pessoas > 1.5m e < 2.0m")
        println("5. Apresentar Média das Alturas")
        println("6. Sair")
        print("Escolha uma opção: ")
        opcao = readln().toInt()

        when (opcao) {
            1 -> {
                if (pessoas.size < 15) {
                    print("Nome: ")
                    val nome = readln()
                    print("Altura (em metros): ")
                    val altura = readln().toDouble()
                    pessoas.add(Pessoa(nome, altura))
                } else {
                    println("Número máximo de pessoas cadastradas!")
                }
            }
            2 -> {
                val menoresOuIguais = pessoas.filter { it.altura <= 1.5 }
                if (menoresOuIguais.isEmpty()) {
                    println("Nenhuma pessoa com altura <= 1.5m cadastrada.")
                } else {
                    println("Pessoas com altura <= 1.5m:")
                    for (pessoa in menoresOuIguais) {
                        println("${pessoa.nome} - ${pessoa.altura}m")
                    }
                }
            }
            3 -> {
                val maiores = pessoas.filter { it.altura > 1.5 }
                if (maiores.isEmpty()) {
                    println("Nenhuma pessoa com altura > 1.5m cadastrada.")
                } else {
                    println("Pessoas com altura > 1.5m:")
                    for (pessoa in maiores) {
                        println("${pessoa.nome} - ${pessoa.altura}m")
                    }
                }
            }
            4 -> {
                val entre = pessoas.filter { it.altura > 1.5 && it.altura < 2.0 }
                if (entre.isEmpty()) {
                    println("Nenhuma pessoa com altura entre 1.5m e 2.0m cadastrada.")
                } else {
                    println("Pessoas com altura entre 1.5m e 2.0m:")
                    for (pessoa in entre) {
                        println("${pessoa.nome} - ${pessoa.altura}m")
                    }
                }
            }
            5 -> {
                if (pessoas.isEmpty()) {
                    println("Nenhuma altura cadastrada para calcular a média.")
                } else {
                    val media = pessoas.map { it.altura }.average()
                    println("Média das alturas: $media m")
                }
            }
            6 -> {
                println("Saindo do programa...")
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    } while (opcao != 6)
}
