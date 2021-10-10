package ch02

import ch02.Color.*

enum class Color(
    val r: Int, val g: Int, val b: Int
    ) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getColor(color: Color) = when (color) {
    RED -> "красный"
    GREEN -> "зелёный"
    BLUE -> "синий"
}

fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)) {
        setOf(RED, GREEN) -> "красно-зеленый"
        setOf(GREEN, BLUE) -> "сине-зеленый"
        else -> throw RuntimeException("Unknown.")
    }

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == GREEN) -> "красно-зеленый"
        (c1 == GREEN && c2 == BLUE) -> "сине-зеленый"
        else -> throw RuntimeException("Unknown.")
    }

fun main() {
    println(GREEN.rgb())
    println(getColor(GREEN))
    try {
        println(mix(BLUE, RED))
    } catch (e: RuntimeException) {
        println("Исключение.")
    }
}
