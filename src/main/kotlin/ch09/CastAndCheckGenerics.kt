package ch09

fun printSum(c: Collection<*>) {
    val list = c as? List<Int> ?: throw IllegalArgumentException("List<Int> expected.")
    println(list.sum())
}

fun printIntSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

//not compiled
/*fun <T> isA(value: Any) = value is T*/

inline fun <reified T> isA(value: Any): Boolean = value is T

inline fun <reified T> Iterable<*>.myFilter(): Collection<T> {
    val dest = mutableListOf<T>()
    for (elem in this) {
        if (elem is T)
            dest.add(elem)
    }
    return dest
}

fun main() {
    printSum(listOf(10, 20, 30))
    //printSum(listOf("error"))

    printIntSum(listOf(1, 2, 3))

    println(isA<String>("test"))
    println(isA<Int>("test"))

    val list = listOf("one", 2, 3, "four")
    println(list.filterIsInstance<String>())
    println(list.myFilter<Int>())
}
