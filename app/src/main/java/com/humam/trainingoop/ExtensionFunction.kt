package com.humam.trainingoop

//CLass

class Student2(val nameConst: String, val alamat: String) {
    fun introduction(): String {
        return "ini manggil fungsi introduction"
    }
}

/**
 * Jadi kelas itu bisa juga dijadikan sebagai extensionFunction, dengan syarat memanggil fun tsb. dengan nama class sebelum nama
 * funnya. Dengan kondisi (membuat fun diluar suatu class).
 */

fun Student2.sayHello(name: String): String {
    return "Hallo $name, nama saya adalah ${this.nameConst} alamat saya di ${this.alamat} \n" +
    this.introduction()
}

val Student2.convertUppercase: String
    get() = this.nameConst.uppercase()

fun main() {
    val student = Student2("Humam", "Jakarta")

    val result = student.sayHello("Rodhi")
    println(result)
    println(student.convertUppercase)
}