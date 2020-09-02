package br.com.digitalhouse.olamundo

fun main () {
    println("Olá mundo Kotlin!\n")
    println(mostrarMeuNome(" Santana Costa", 31))
    println("=====================================")
    println("          LISTA DE ALUNOS")
    println("=====================================")
    for (nome in alunosDeAndroid()){
        println("Nome do aluno: "+nome)


    }
    println("=====================================")
    println("           FIM DA LISTA")
    println("=====================================")



}
fun mostrarMeuNome(sobrenome:String, idade:Int): String{

    val idadeRecebida = when(idade){
        18->"Tem 18 anos"
        20->"tem 20 anos"
        25->"tem 25 anos"
        30->"tem 30 anos"
        else ->"Não sabe a idade"


    }
    return "Douglas$sobrenome e idade $idadeRecebida"

}
fun alunosDeAndroid(): ArrayList<String>{
    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Douglas")
    listaAlunos.add("Jessica")
    listaAlunos.add("Julio")
    listaAlunos.add("Lucy")
    listaAlunos.add("Brutus")


    return listaAlunos

}
