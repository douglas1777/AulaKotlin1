package Exercicio1
fun main (){
    val primeirosCemImpares = (1..201).filter { n -> n % 2 != 0 }
    println(" primeiros 100 ímpares: $primeirosCemImpares ")
}
