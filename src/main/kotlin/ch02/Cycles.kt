package ch02

import java.util.*

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun dictionary() {
    val treeMap = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        treeMap[c] = Integer.toBinaryString(c.toInt())
    }
    for ((letter, binary) in treeMap) {
        println("$letter = $binary")
    }
}

fun main() {
    for (i in 1..100) {
        print("${fizzBuzz(i)} ")
    }
    println()
    for (i in 1..50 step 3) {
        print("${fizzBuzz(i)} ")
    }
    println()
    for (i in 50 downTo 1) {
        print("${fizzBuzz(i)} ")
    }
    dictionary()
}
