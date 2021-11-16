package ch09

import сh01.Person

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

class NullableProcessor<T> {
    fun process(value: T): Int = value?.hashCode() ?: -1
}

class Processor<T : Any> {
    fun process(value: T): Int = value.hashCode()
}

fun main() {
    println(listOf(1,2,3).mySum())

    val nullableProcessor = NullableProcessor<String?>()
    println(nullableProcessor.process(null))

    val processor = Processor<Person>()
    println(processor.process(Person("Pavel", 32)))
}
