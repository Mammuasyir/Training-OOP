package com.humam.trainingoop

open class Shape2(val name: String, val shape: String, val color: String) {
    constructor(name: String, shape: String): this(name, shape, "")
    constructor(name: String): this(name, ""){
    }

    fun cetakBentuk() {
        if (color == "" && shape == ""){
            println("ini adalah constructor 3")
        } else if (color == ""){
            println("ini adalah constructor 2")
        } else{
            println("ini adalah constructor 1")
        }
    }
}

class Rectangle2: Shape2 {
    constructor(name: String, shape: String, color: String ): super(name, shape, color)
    constructor(): super("Kursi", "Rectangle")
    constructor(name: String): super(name)

}

fun main() {
    val kursi = Rectangle2("hijau", "meja", "persegi")
    kursi.cetakBentuk()

    val kursi2 = Rectangle2()
    kursi2.cetakBentuk()

    val kursi3 = Rectangle2("Pulpen")
    kursi3.cetakBentuk()
}

