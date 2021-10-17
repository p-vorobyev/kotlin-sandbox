enum class Color {
    RED,
    GREEN,
    BLUE
}

infix fun Color.to(other: Any) = Pair(this, other)

fun main(args: Array<String>) {
    val mutableMapOf = mutableMapOf(Color.RED to "red color")
    println(mutableMapOf)
}
