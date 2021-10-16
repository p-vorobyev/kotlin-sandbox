package ch02

import java.io.BufferedReader
import java.io.StringReader

fun canFireException(i: Int) {
    val number =
        if (i in 0..100)
            i
        else {
            throw IllegalArgumentException("A number must be between 0 and 100: $i")
        }
    println(number)
}

fun readNumber(reader: BufferedReader): Int? {
    return try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}

fun main() {
    //canFireException(-8)
    val reader = BufferedReader(StringReader("-87987"))
    println(readNumber(reader))
    println(Int.MAX_VALUE)
}
