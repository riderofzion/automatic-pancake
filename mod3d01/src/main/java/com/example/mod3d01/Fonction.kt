package com.example.mod3d01

//fonction d'extension
//fun main() {
//    fun Int.double() : Int{
//        return this * 2
//    }
//    println(10.double())
//}

//opérateur Elvis
//fun main() {
//    var name : String? = null
//
//    var length = name?.length?:-1
//    println(length)
//}

//liste et expression lambda
fun main() {
    val colors = mutableListOf<String>()
    colors.add("yellow")
    colors.add("red")
    colors += "yellow"
    colors += "blue"
    colors += "black"

    //paramètre appelé it par défaut
    var nbYellow = colors.filter { color ->
        color == "yellow"
    }.count()

    println(nbYellow)
}











