package ch07

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) =
        Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Double) =
    Point((x * scale).toInt(), (y * scale).toInt())

//same opportunity for set when mutable object
operator fun Point.get(index: Int) = when(index) {
    0 -> x
    1 -> y
    else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
}

operator fun Double.times(p: Point) =
    Point((p.x * this).toInt(), (p.y * this).toInt())

operator fun Char.times(count: Int) = toString().repeat(count)

class Animal(val name: String, val predator: Boolean): Comparable<Animal> {
    override fun compareTo(other: Animal): Int {
        return compareValuesBy(this, other, Animal::name, Animal::predator)
    }
}

fun main() {
    var point = Point(1, 2)
    val point1 = Point(3, 4)
    println(point + point1)
    point += point1
    println(point)
    println(point * 1.5)
    println(1.5 * point)
    println(('a' * 10).uppercase())
}
