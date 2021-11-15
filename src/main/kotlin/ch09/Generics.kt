package ch09

fun <T : Number> List<T>.mySum(): T {
    var sum = 0.0
    forEach {
        if (it is Int ||
            it is Double ||
            it is Long ||
            it is Float) {
            sum += it.toDouble()
        }
    }
    return sum as T
}

fun main() {
    println(listOf(1,2,3).mySum())
}
