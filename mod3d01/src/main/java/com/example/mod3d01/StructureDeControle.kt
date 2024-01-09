package com.example.mod3d01


//utilisation du if
//fun main() {
//
//    val age = 18
//
//    val message = if(age == 18){
//        "majeur"
//    }else{
//        "mineur"
//    }
//    println(message)
//}

//when
//fun main() {
//    val age = 90
//
//    when (age){
//        1,2 -> println("C'est un bébé !")
//        in 1..18, in 50..75 -> println("C'est un extrême !")
//        is Int -> println("C'est un entier")
//        else -> println("C'est autre chose")
//    }
//}

//boucles
fun main() {

    val cities = arrayOf("Nantes", "Rennes", "Quimper")

    for( c in cities){
        println(c)
    }

//    for(i in 1..10){
//        println(i)
//    }
//
//    for(j in 10 downTo 1 step 2){
//        println(j)
//    }

    for((k, v) in cities.withIndex()){
        println("$k : $v")
    }

}















