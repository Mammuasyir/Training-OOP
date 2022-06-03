package com.humam.trainingoop

abstract class Employee3() {
    abstract val name: String
    abstract val job: String
    abstract fun sayHello3(name: String): Unit
    abstract fun jenisPekerjaan3(): Unit
}

class Manager3(val umur: Int): Employee3(){
    override val name: String
        get() = "Tio"
    override val job: String
        get() = "Kuli"

    override fun sayHello3(name: String) {
        println("Hello $name, my name is ${this.name} and my age is $umur")
    }

    override fun jenisPekerjaan3() {
        println("Jenis pekerjaannya adalah $job")
    }

}



fun main() {
    val humam = Manager3(10)
    humam.sayHello3("Rodhi")
    humam.jenisPekerjaan3()

}