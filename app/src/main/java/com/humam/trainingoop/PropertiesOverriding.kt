package com.humam.trainingoop

open class Shape {
    open val corner: Int = -1
}

class Rectangle: Shape() {
    override val corner: Int = 50
}

class Oval: Shape() {
    override val corner: Int
        get() = super.corner
}

fun main() {
    val rectangle = Rectangle()
    println(rectangle.corner)

    val oval = Oval()
    println(oval.corner)
}
