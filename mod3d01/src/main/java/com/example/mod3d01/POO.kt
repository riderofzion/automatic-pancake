package com.example.mod3d01

class Basique
val basique = Basique()

//création de class classique

open class Serie() {

    private var name : String = ""
    constructor(name :String) : this() {
        this.name = name
    }

    open fun getName(): String {
        return this.name
    }
}

class SeriePourEnfant(private var name : String) : Serie(name){
    override fun getName(): String {
        return super.getName() + " mais pour les enfants !"
    }
}

data class Machin(private var bidule : String, private var chose : Int)


fun main() {

    val serie = Serie("The Witcher")
    println(serie.getName())

    val seriePourEnfant = SeriePourEnfant("Pat Patrouille")
    println(seriePourEnfant.getName())

    //val machin : Machin = Machin("truc", 5)
    Machin("truc", 5).also {
        println(it)
    }


}
