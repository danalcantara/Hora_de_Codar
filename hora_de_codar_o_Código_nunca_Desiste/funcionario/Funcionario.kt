import java.util.*

data class Funcionario(
    val matricula: Int,
    val nome: String,
    val salario: Double
)

fun main() {
    val funcionarios = mutableListOf<Funcionario>()

    var opcao: Int

    do {
        println("\nMenu:")
        println("1. Cadastrar Funcionário")
        println("2. Pesquisar Funcionário")
        println("3. Apresentar Funcionários com Salário > R$1.000")
        println("4. Apresentar Funcionários com Salário < R$1.000")
        println("5. Apresentar Funcionários com Salário = R$1.000")
        println("6. Sair")
        print("Escolha uma opção: ")
        opcao = readln().toInt()


        when (opcao) {
            1 -> {
                if (funcionarios.size < 20) {
                    print("Matrícula: ")
                    val matricula = readln().toInt()

                    print("Nome: ")
                    val nome = readln()
                    print("Salário: ")
                    val salario = readln().toDouble()
                    funcionarios.add(Funcionario(matricula, nome, salario))
                    // Classificar por matrícula após o cadastro
                    funcionarios.sortBy { it.matricula }
                } else {
                    println("Número máximo de funcionários cadastrados!")
                }
            }
            2 -> {
                print("Digite o número da matrícula para pesquisar: ")
                val matriculaBusca = readln().toInt()
                val funcionarioEncontrado = funcionarios.find { it.matricula == matriculaBusca }
                if (funcionarioEncontrado != null) {
                    println("Funcionário encontrado: $funcionarioEncontrado")
                } else {
                    println("Funcionário não encontrado.")
                }
            }
            3 -> {
                val acimaDeMil = funcionarios.filter { it.salario > 1000 }.sortedBy { it.matricula }
                if (acimaDeMil.isEmpty()) {
                    println("Nenhum funcionário com salário acima de R$1.000,00 cadastrado.")
                } else {
                    println("Funcionários com salário acima de R$1.000,00:")
                    for (funcionario in acimaDeMil) {
                        println("${funcionario.matricula} - ${funcionario.nome} - R$${funcionario.salario}")
                    }
                }
            }
            4 -> {
                val abaixoDeMil = funcionarios.filter { it.salario < 1000 }.sortedBy { it.matricula }
                if (abaixoDeMil.isEmpty()) {
                    println("Nenhum funcionário com salário abaixo de R$1.000,00 cadastrado.")
                } else {
                    println("Funcionários com salário abaixo de R$1.000,00:")
                    for (funcionario in abaixoDeMil) {
                        println("${funcionario.matricula} - ${funcionario.nome} - R$${funcionario.salario}")
                    }
                }
            }
            5 -> {
                val igualMil = funcionarios.filter { it.salario == 1000.0 }.sortedBy { it.matricula }
                if (igualMil.isEmpty()) {
                    println("Nenhum funcionário com salário igual a R$1.000,00 cadastrado.")
                } else {
                    println("Funcionários com salário igual a R$1.000,00:")
                    for (funcionario in igualMil) {
                        println("${funcionario.matricula} - ${funcionario.nome} - R$${funcionario.salario}")
                    }
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
