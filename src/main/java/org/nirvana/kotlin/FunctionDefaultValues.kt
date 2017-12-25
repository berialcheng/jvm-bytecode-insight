package org.nirvana.kotlin

val b = 2

fun foo(a: Int = 0, b: String = "default"): String {
    println(a)
    return b
}