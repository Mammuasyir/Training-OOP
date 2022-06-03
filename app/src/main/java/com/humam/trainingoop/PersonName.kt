package com.humam.trainingoop

//Secondary constructor, harus memakai this yang berfungsi untuk mengarahkan data dalam init yang ada pada constructor primary
class PersonName (firstNameArgs: String, middleNameArgs: String, lastNameArgs: String?){
    constructor(firstname: String, lastName: String): this(firstname, "", lastName)
    constructor(firstname: String): this(firstname, "", null)

    // jadi kita bisa memasukkan properties langsung kedalam constructor, agar lebih hemat dalam penggunaan barisnya
//  // dan tidak perlu buat properties lg dalam class
    /**
     * constructor(var firstnameArgs: String, val lastNameArgs: String): this(firstname, "", lastName)
      */

    init {
        println("""
            nama saya adalah $firstNameArgs $middleNameArgs $lastNameArgs
        """.trimIndent())
    }

    var firstname = firstNameArgs
    var lastname = lastNameArgs
    var middlename = middleNameArgs
}

fun main() {
    val name1 = PersonName("Humam", "Asyir")
    val name2 = PersonName("Humam", "Asyir", "Mu") // ngambil constructor dari yang pertama
    val name3 = PersonName("Tio") //ngambil dari constructor yang kedua, bukan yang pertama

    println()
    println(name1.lastname)
    println(name2.middlename)
    println(name3.firstname)

    /**
     * kalu pake var dalam constructor harus dimanipulasi dulu datanya agar terpanggil variablenya
     */
//    name1.firstNameArgs = "Hyuman"

//    println(name1.lastNameArgs)
//    println(name2.middleNameArgs)
//    println(name3.firstNameArgs)
}