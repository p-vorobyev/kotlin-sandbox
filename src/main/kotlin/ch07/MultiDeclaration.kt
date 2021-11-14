package ch07

fun main() {
    val p = Point(10, 20)
    val (x, y) = p
    println("x: $x, y: $y")

    val (x1, y1) = PointClass(1, 2)
    println("x: $x1, y: $y1")
}

class PointClass(val x: Int, val y: Int)

operator fun PointClass.component1() = x
operator fun PointClass.component2() = y
