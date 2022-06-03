package com.humam.trainingoop

/**
 * Inner class untuk menambahkan class di dalam class agar tidak conflict
 */

class Boss(val name: String){

    inner class Employee(val name: String){
        fun hi() {
            println("Hi, I'm $name, and my boss is ${this@Boss.name}")
        }
    }
}

fun main() {
    val eko = Boss("Eko")

    val joko = eko.Employee("Joko")
    joko.hi()

    val budi = eko.Employee("Budi")
    budi.hi()
}