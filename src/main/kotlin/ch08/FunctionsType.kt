package ch08

val sum: (Int, Int) -> Int = {x, y -> x + y }

val action: (String) -> Unit = { s -> println(s) }

fun doingAction(description: String, x: Int, y: Int,
                print: (String) -> Unit,
                action: (Int, Int) -> Int) {
    print("$description $x + $y")
    println("Result: ${action(x, y)}")
}

fun String.myFilter(predicate: (Char) -> Boolean): String {
    val builder = StringBuilder().apply {  }
    for (index in 0 until length) {
        val char = get(index)
        if (predicate(char))
            builder.append(char)
    }
    return builder.toString()
}

fun main() {
    doingAction("Get sum", 1, 2, action, sum)

    println("ab123c".myFilter { it in 'a'..'z' })
}
