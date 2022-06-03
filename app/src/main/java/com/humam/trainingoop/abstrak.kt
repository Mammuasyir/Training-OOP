package com.humam.trainingoop

abstract class Employee2(val name: String, val job: String)
class Manager2(name: String, job: String): Employee2(name, job)

abstract class Animal{
    abstract val name: String
    abstract fun run(): Unit
}

class Cat: Animal(){
    override val name: String
        get() = "chika"

    override fun run() {
        println("ayo $name lari")
    }

}

fun main() {
//    val employee2 = Employee2("ridoh", "engin") //kode error karena abstract tidak bisa membuat object..
    val manager2 = Manager2("Tio", "trainer")

    val cat = Cat()
    println(cat.name)
    cat.run()
}