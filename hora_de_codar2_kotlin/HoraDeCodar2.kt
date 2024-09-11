import kotlin.math.max

class HoraDeCodar2 {


    fun ex1(){
        print("Digite um numero: ")
        var n1: Int = readln().toInt()

        print("Digite outro numero: ")
        var n2: Int = readln().toInt()

        println(if (n1 >n2) "$n1 e maior" else "$n2 é maior")
    }
    fun ex2(){
        print("Digite um valor: ")
        var n1 = readln().toInt()
        if (n1 != 0) {
            println(if (n1 > 0) "Positivo" else "Negativo")
        } else (
            println("O valor e neutro")
        )
    }
    fun ex3(){
        var list = mutableListOf<Int>()
        for (n in 1..3) {
            print("Digite um numero: ")
            var n1: Int = readln().toInt()
            list.add(n1)
        }
        println(list.max())
    }
    fun ex4(){
        var list = mutableListOf<Int>()
        for (n in 1..3){
            print("Digite um numero: ")
            var n1 = readln().toInt()
            list.add(n1)
        }
        list.sortDescending()
        println("${list[0]} + ${list[1]} = ${list[0]+list[1]}")
    }
    fun ex5(){
        var media = 0
        for (n in 1..6){
            print("Digite um numero: ")
            var n1 = readln().toInt()
            media += n1
        }
        println("Media: ${media/6}")
    }
    fun ex6() {
        var list = mutableListOf<Int>()
        var maior: Int = 0
        for (n in 1..4) {
            print("Digite um numero: ")
            var n1 = readln().toInt()
            if (n1 > maior){
                maior = n1
            }
            list.add(n1)
        }
        print("""
            Maior: $maior
            Primeiro: ${list.first()}
            Ultimo: ${list.last()}
        
        """.trimIndent())
    }
    fun ex7(){
        var list = mutableListOf<Int>()
        var sum:Int = 0
        for (n in 1..6){
            print("Digite um valor: ")
            var n1: Int = readln().toInt()
            if (n1 < 72){
                sum += n1
            }
            list.add(n1)
        }
        for ( v in list){
            println("valor: $v")
        }
        println("Total: $sum")

    }
    fun ex8(){
        var media = 0
        for (n in 1..4) {
            print("Digite um numero: ")
            var n1 = readln().toInt()

            while (n1 !in 0..10) {
                print("Digite um numero: ")
                n1 = readln().toInt()
            }
            media += n1
        }
        println(if ((media / 4) > 5) "Você passou, tirou ${media / 4}" else "Você reprovou...")
    }

    fun ex9(){
        print("Digite seu ano de nascimento: ")
        var anoNascimento = readln().toInt()

        println(if ((2024 - anoNascimento)>16) "Pode Votar" else "Não pode Votar")
    }
    fun ex10(){
        print("Digite seu sexo de nascimento (1-Feminino/2-Masculino): ")
        var sexo:Int = readln().toInt()
        while (sexo !in 1..2){
            print("Digite seu sexo de nascimento (1-Feminino/2-Masculino): ")
            sexo = readln().toInt()

        }
        print("Digite sua altura: ")
        var altura:Double = readln().toDouble()

        when(sexo){
            1 -> {
                println("Resultado: ${(62.1*altura)-44.7}")
            }
            2 -> {
                println("Resultado: ${(72.7*altura)-58}")
            }
        }
    }
    fun ex11(){
        print("Digite um numero: ")
        var num1 = readln().toInt()

        print("Digite outro numero: ")
        var num2 = readln().toInt()

        print("""
            Digite uma operação
            
            1- Soma
            2- Subtração
            3- Divisão
            4- Multiplicação
            
        Digite: """.trimIndent())
        var escolha:Int = readln().toInt()
        when (escolha){
            1 -> println("Soma: ${num1 +num2}")
            2-> println("Subtração: ${num1-num2}")
            3 -> println("Divisão: ${num1/num2}")
            4 -> println("Multiplicação: ${num1*num2}")
        }
    }

}