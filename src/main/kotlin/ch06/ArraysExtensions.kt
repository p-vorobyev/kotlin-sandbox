package ch06

fun indices(arr: Array<Int>) {
    for (i in arr.indices) {
        println("Arguments $i is: ${arr[i]}")
    }
}

fun eachIndexed(arr: Array<Int>) {
    arr.forEachIndexed { index, any -> println("Arguments $index is: $any") }
}

fun main() {
    val ints = Array(5) { i -> i + 1 }
    indices(ints)
    eachIndexed(ints)
}
