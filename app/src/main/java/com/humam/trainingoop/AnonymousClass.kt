package com.humam.trainingoop

interface Action{
    fun result(): Unit
}

fun fireAction(action: Action) {
    action.result()
}

fun main() {
    fireAction(object : Action {
        override fun result() {
            println("Action one")
        }
    })

    fireAction(object : Action {
        override fun result() {
            println("Action two")
        }
    })
}