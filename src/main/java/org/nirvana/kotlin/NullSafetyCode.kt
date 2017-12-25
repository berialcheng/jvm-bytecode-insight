package org.nirvana.kotlin

class NullSafetyCode {
    fun foo(){
        var a: String = "Kotlin"
//        a = null // compilation error

        var b: String? = "abc"
        b = null // ok


        println(b?.length?.hashCode())
        println(a?.length?.hashCode())
    }
}