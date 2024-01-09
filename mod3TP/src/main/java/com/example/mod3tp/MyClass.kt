package com.example.mod3tp

fun sissa() {

    var nbSeed = 1.toBigInteger()
    val multiplicator = 2.toBigInteger()

    for (i in 1..64) {
        nbSeed = nbSeed.multiply(multiplicator)
        println(nbSeed)
    }
    println(nbSeed)
}

fun average() {

    println("Entrez le nombre de valeurs :")
    val nbValues = readln()
    var number = 0
    var sum = 0.0

    do {
        println("Valeur :")
        var value = readln()
        sum += value.toDouble()
        number++
    } while (number < nbValues.toInt())

    println("La moyenne est de " + sum / nbValues.toInt())

}

fun average2(){
    var sum = 0.0
    var nbValues = 0

    do {
        println("Note -1 pour terminer !")
        val note = readln().toDoubleOrNull()

        if(note != null && note >= 0.0){
            sum += note
            nbValues++
        }
    }while (note != -1.0)

    println("La moyenne est de " + sum / nbValues)

}

fun main() {
    //sissa()
    //average()
    average2()
}