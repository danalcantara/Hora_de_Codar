class HoraDeCodar4 {

    fun exercicio1() {
        var cont = true
        var estudantes = mutableListOf<String>()
        println("Digite PARE se quiser sair")
        while (cont) {

            print("Digite seu nome estudante: ")
            var nome = readln()

            if (nome.lowercase() == "pare") {
                println("Saindo...")
                cont = false

            } else {
                estudantes.add(nome)
            }
        }
        for (v in estudantes){
            println("Estudante: $v")
        }
    }
    fun exercicio2(){
        var lista = mutableListOf( "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno" )
        var lista_de_negativas = mutableListOf("não", "nao", "n", "na", "ñ")
        var cond = true
        while (cond){
            print("Digite um nome de planeta: ")
            var nome_planeta = readln()

            if (nome_planeta in lista){
                println("O planeta $nome_planeta esta na lista")
            } else {
                println("O planeta $nome_planeta não esta na lista...")
            }

            print("""
                Deseja continuar:
                S = Sim/ N = Não
                responda: """)

            var sair = readln()

            if (sair.lowercase() in lista_de_negativas){
                cond = false
            }


        }
    }
    fun exercicio3(){
        var lista_frutas_no_mercado = mutableListOf("maça", "mamão", "banana", "pera", "uva", "laranja")
        var cond = true
        while (cond) {
            for (v in lista_frutas_no_mercado){
                println(v)
            }
            print("Digite o nome da fruta que voce quer: ")
            var nome_fruta = readln()

            if (nome_fruta in lista_frutas_no_mercado){
                println("A fruta foi retirada")
                lista_frutas_no_mercado.remove(nome_fruta)
            } else {
                println("A fruta não esta disponivel")
            }
            if (lista_frutas_no_mercado.size == 0){
                cond = false
            }
        }
    }
}