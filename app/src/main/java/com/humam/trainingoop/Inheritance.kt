package com.humam.trainingoop

//Inheritance
//Kelas induk
open class Employee(val name: String, val job: String) {
    fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }

    /**
     * ini merupakan overriding, jadi kita bisa membuat ulang atau mengcustom hasil dari fun yang ada di kelas induk
     * ke dalam class Child
     */
    open fun jenisPekerjaan(){
        println("Jenis pekerjaannya adalah $job")
    }
}

//Class Child
class Manager(name: String, job: String): Employee(name, job){
    override fun jenisPekerjaan() {
        println("ini output yang berbeda karena memakai override")
    }
}

//Class Child
class VicePresident(name: String, job: String): Employee(name, job )

fun main() {
    val humam = Manager("Humam", "Web Developer")
    humam.sayHello("Tio")
    humam.jenisPekerjaan()

    val ripal = VicePresident("Ripal", "Software")
    ripal.sayHello("Rodhi")
    ripal.jenisPekerjaan()
}