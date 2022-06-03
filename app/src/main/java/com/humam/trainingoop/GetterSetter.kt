package com.humam.trainingoop

class GetterSetter(val title: String) {
    var bigTitle: String = title
        get() = field.uppercase()
    set(value) {
        if (value.isNotBlank()){
            field = value
        } else {
            field = "ini kosong"
        }
    }
}

fun main() {
    val note = GetterSetter("tio")
    println(note.bigTitle)

    note.bigTitle = ""
    println(note.bigTitle)
}