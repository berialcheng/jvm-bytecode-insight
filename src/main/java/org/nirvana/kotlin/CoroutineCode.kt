package org.nirvana.kotlin

import kotlinx.coroutines.*

class CoroutineCode {

    fun main(args : Array<String>){
        println("Start")

        // Start a coroutine
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }

        Thread.sleep(2000) // wait for 2 seconds
        println("Stop")
    }
}