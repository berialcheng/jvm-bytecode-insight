package org.nirvana.kotlin

fun foo(){
    var a = 1
    // simple name in template:
    val s1 = "a is $a"
    print(s1)

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    print(s2)
}
