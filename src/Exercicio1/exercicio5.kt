package Exercicio1
fun main() {
    val numA = 24
    val numB = 26
    val numC = 27
    val numD = 22
    val resultado = ((numA > numC) && (numA > numD)) || ((numB > numC) && (numB > numD))
    println("$numA é maior que $numC e $numD OU $numB é maior que $numC e $numD? $resultado")
}