package com.humam.trainingoop

class Television {
    lateinit var brand: String

    fun initTelevision() {
        brand = "samsung"
    }
}

fun main() {
    val tv = Television()

    /**
     * tidak bisa langsung karena brandnya belum kita inisiasikan, jadi harus panggil funnya dulu
     */
//    println(tv.brand)

    tv.initTelevision()
    println(tv.brand)
}