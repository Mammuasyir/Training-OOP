package com.humam.trainingoop

class Laptop(val brand: String): Any(){
    override fun toString(): String {
        return "ini adalah brand $brand"
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            !is Laptop -> {
                println("ini ga sama")
                false
            }
            else -> {
                println("ini sama")
                true
            }
        }
    }
}


fun main() {
    val laptop = Laptop("Hp")
    val laptop2 = Laptop("Asus")

    println(laptop.toString())
    println()

    println(laptop.equals(laptop2))
    println(laptop.equals("robot"))
}