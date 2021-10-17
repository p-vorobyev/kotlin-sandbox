package ch03

import ch03.strings.joinToString
import ch03.strings.joinToStringCollection

fun main() {
    val set = hashSetOf(1, 2, 53)
    val list = arrayListOf(1, 2, 53)
    val map = hashMapOf(Pair(1, "one"), Pair(7, "seven"), 53 to "fifty-three")
    println(joinToString(set, ";", "{", "}"))
    println(joinToString(list, separator = "; ", prefix = "{", postfix = "}"))
    println(list.joinToStringCollection())
}
