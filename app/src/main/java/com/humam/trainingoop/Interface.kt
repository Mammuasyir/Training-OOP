package com.humam.trainingoop

//Interface itu bersifat abstract, jadi semua yang ada di dalamnya juga abstract. dan tidak perlu menambahkan kata kunci abstract.

interface Volume {
    val panjang: Int
    val lebar: Int
    val tinggi: Int

    fun hitungVolume(): Int
}

interface luas{

    fun hitungLuas() : Int
}

/**
 * Sebuah child class bisa menggunakan lebih dari satu interface, berbeda dari abstract kelas yg hanya bisa memakai satu parent class abstract / Inheritancenya satu doang pada class abstract
 */

class Balok(override val panjang: Int, override val lebar: Int, override val tinggi: Int): Volume, luas{
    override fun hitungVolume(): Int {
        return panjang * lebar * tinggi / 100
    }

    override fun hitungLuas(): Int {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)) / 100
    }

}

fun main() {
    val balok = Balok(100, 50, 50)
    println("""
        Volume dari balok adalah ${balok.hitungVolume()} CM
        dan Luas dari balok adalah ${balok.hitungLuas()} CM
    """.trimIndent())
}