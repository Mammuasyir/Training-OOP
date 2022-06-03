package com.humam.trainingoop

sealed class Operation(val name: String)

class Plus(): Operation("add")
class Minus(): Operation("minus")

fun operation(value1: Int, value2: Int, operation: Operation): Int{
    return when(operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}

fun main() {
    val plus = Plus()
    val minus = Minus()

    println(operation(12,13, plus))
    println(operation(12,13, minus))
}