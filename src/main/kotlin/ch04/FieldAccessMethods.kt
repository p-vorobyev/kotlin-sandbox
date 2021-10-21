package ch04

import java.util.stream.IntStream

class Employee(val name: String) {
    var address: String = "unknown"
        set(value) {
            println("""
                Address for $name changed:
                $field -> $value
            """.trimIndent())
            field = value
        }
}

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val employee = Employee("John")
    employee.address = "Street of happiness, 39"

    val lengthCounter = LengthCounter()
    IntStream.range(0, 1000)
        .forEach { lengthCounter.addWord("a") }
    println(lengthCounter.counter)
}
