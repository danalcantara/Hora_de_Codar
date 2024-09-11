class HoraDeCodar {
    fun ex1() {
        var nome_do_carro = "Fusca"
        print(nome_do_carro)
    }
    fun ex2(){
        print("Digite seu nome: ")
        var nome = readln()

        println("Ola, $nome")
    }
    fun ex3(){
        print("Base: ")
        var base = readln().toDouble()
        print("Altura: ")
        var altura = readln().toDouble()

        println(base*altura)
    }
    fun ex4(){
        print("Lado: ")
        var lado = readln().toDouble()

        print("Resultado: ${lado*lado}")
    }
    fun ex5(){
        print("Diagonal menor: ")
        var diagonalMenor = readln().toDouble()
        print("Diagonal Maior: ")
        var diagonalMaior = readln().toDouble()

        print("Resultado: ${(diagonalMenor*diagonalMaior)/2}")
    }
    fun ex6(){
        print("Base maior: ")
        var baseMaior = readln().toDouble()
        print("Base menor: ")
        var baseMenor = readln().toDouble()
        print("Altura: ")
        var altura = readln().toDouble()
        print("Resultado: ${((baseMaior+baseMenor)*altura)/2}")
    }
    fun ex7(){
        print("Base: ")
        var base = readln().toDouble()
        print("Altura: ")
        var altura = readln().toDouble()

        println(base*altura)
    }
    fun ex8(){
        print("Base: ")
        var base = readln().toDouble()
        print("Altura: ")
        var altura = readln().toDouble()

        println((base*altura)/2)
    }
    fun ex9(){
        var pi = 3.14
        print("Digite o raio: ")
        var raio = readln().toDouble()

        println("Resultado: ${pi*(raio*raio)}")
    }
}
