package org.nirvana.kotlin

class LambdaCode {

    fun foo(){
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits
                .filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }
}