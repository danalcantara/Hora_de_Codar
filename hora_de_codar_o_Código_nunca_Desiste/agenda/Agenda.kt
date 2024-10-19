

data class Contato(
    val nome: String,
    val endereco: String,
    val telefone: String
)

fun main() {
    val contatos = mutableListOf<Contato>()
    var opcao: Int

    do {
        println("\nMenu:")
        println("1. Cadastrar Contato")
        println("2. Pesquisar Contato")
        println("3. Classificar Contatos")
        println("4. Apresentar Contatos")
        println("5. Sair")
        print("Escolha uma opção: ")

        var opcao = readln().toInt() // Consumir a nova linha

        when (opcao) {
            1 -> {
                if (contatos.size < 10) {
                    print("Nome: ")
                    val nome = readln()
                    print("Endereço: ")
                    val endereco = readln()
                    print("Telefone: ")
                    val telefone = readln()
                    contatos.add(Contato(nome, endereco, telefone))
                } else {
                    println("Número máximo de contatos cadastrados!")
                }
            }
            2 -> {
                print("Digite o nome para pesquisar: ")
                val nomeBusca = readln()
                val contatoEncontrado = contatos.find { it.nome.equals(nomeBusca, ignoreCase = true) }
                if (contatoEncontrado != null) {
                    println("Contato encontrado: $contatoEncontrado")
                } else {
                    println("Contato não encontrado.")
                }
            }
            3 -> {
                contatos.sortBy { it.nome }
                println("Contatos classificados por nome.")
            }
            4 -> {
                if (contatos.isEmpty()) {
                    println("Nenhum contato cadastrado.")
                } else {
                    println("Contatos cadastrados:")
                    for (contato in contatos) {
                        println(contato)
                    }
                }
            }
            5 -> {
                println("Saindo do programa...")
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    } while (opcao != 5)
}
