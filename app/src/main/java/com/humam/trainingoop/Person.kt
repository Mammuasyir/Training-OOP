package com.humam.trainingoop

//parameter di dalam kelas itu namanya constructor
class Person(nameParams: String, ageParams: Int, addressParams: String) {

    /**
     * init akan dieksekusi ketika constructor dipanggil, artinya ketika sebuah object dibuat maka block kode initlah yang akan pertama kali dieksekusi
     * lalu setelahnya object yang dibuat
     */
    //adalah hal yang pertama kali dieksekusi ketika dipanggil
    init {
        println("""
            ini dipanggil di init!
            nama saya $nameParams
        """.trimIndent())
        println()
    }

    //variabel di dalam kelas itu namanya properties/ attributes
    var name: String = nameParams
    var age: Int = ageParams
    var address: String =  addressParams
}

fun main() {
    //object atau instance di dalam function
    val udin = Person("Udin", 10,"Bogor")
    val result = """
        halo nama saya ${udin.name}
        umur saya adalah ${udin.age}
        saya tinggal di ${udin.address}
    """.trimIndent()

    println(result)
    println()

    val ancol = Person("Ancol", 14,"Bigor")
    val result2 = """
        halo nama saya ${ancol.name}
        umur saya adalah ${ancol.age}
        saya tinggal di ${ancol.address}
    """.trimIndent()

    println(result2)
    println()

    //Manipulasi atau mengubah nilai  dengan cara menulis nama object sebelum titik, kemudian diikutin dengan properties di dalam kelas
    udin.age = 20
    println(udin.age)
}