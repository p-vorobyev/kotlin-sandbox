package ch03

import java.lang.StringBuilder
import java.util.stream.Stream

fun concatChars(vararg values: CharSequence): String {
    val builder = StringBuilder()
    values.asList().forEach { builder.append(it) }
    return builder.toString()
}

fun unpackArray(values: Array<Int>): Stream<Int> {
    return listOf(*values).stream()
}

fun main() {
    println(concatChars("he", "ll", "o"))
    val list = unpackArray(arrayOf(1, 2, 3))
    println(list.count())
}
