package ch02

import java.util.*
import kotlin.math.abs

data class Rectangle(private val width: Int,
                private val height: Int) {
    val isSquare: Boolean
    get() {
        return width == height
    }
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(abs(random.nextInt()), abs(random.nextInt()))
}

fun main() {
    val rectangle = Rectangle(2, 3)
    val rectangle1 = Rectangle(3, 3)
    val randomRectangle = createRandomRectangle()
    println(rectangle.isSquare)
    println(rectangle1.isSquare)
    println(randomRectangle)
}

