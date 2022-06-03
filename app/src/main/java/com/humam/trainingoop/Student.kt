package com.humam.trainingoop

//Penjelasan function di dalam class
class Student(val name: String) {

    //Behavior atau perilaku si object
    fun sayHello(name: String){
        println("Hello $name, saya ${this.name}") // this keyword digunakan agar bisa mengakses param class jika fun memiliki nama yang sama
    }

    /**
     * function OVERLOADING, nama fun boleh sama, tpi type data atau jumlah paramnya harus berbeda. atau tidak ada param
     */

    fun running(){
        println("Murid dengan nama $name bisa berlari")
    }
}

fun main() {
    val student = Student("Humam")
    student.sayHello("Zaky")

    student.running()
}