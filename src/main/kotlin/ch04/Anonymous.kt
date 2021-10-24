package ch04

import java.util.function.Predicate

fun main() {
    object : Predicate<String> {
        override fun test(t: String): Boolean {
            TODO("Not yet implemented")
        }
    }
}
