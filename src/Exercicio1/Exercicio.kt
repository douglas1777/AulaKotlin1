package Exercicio1

//Escrevero código que deve analisar três números inteiros e retornaro maior deles.
fun main(){
println(analise())

}
fun analise(){
    //declarei as vaiaveis inteiras
    var num =1
    var num1 =4
    var num2 = 6
    if(num > num1 && num > num2){
       println("o $num  é o maior numero")
    }else if (num1 > num && num > num2){
        println("o $num1 é o maior numero")

    }else {
        println("o $num2 é o maior numero")
    }
}