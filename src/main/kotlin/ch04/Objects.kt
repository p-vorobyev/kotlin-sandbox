package ch04

import сh01.Person
import kotlin.random.Random

//like singleton in java
object Payroll {

    val employees = listOf<Person>()

    fun calculateSalary() {

    }

}

class Utils private constructor() {
    companion object {
        fun utilMethod() {
            println("I'm like java static method!")
        }
    }
}

class Store {
    companion object Check {
        fun calculate() = Random(1000).nextDouble()
    }
}

interface JSONFactory<T> {
    fun fromJSON(value: String): T
}

class Element(val name: String) {
    companion object: JSONFactory<Element> {
        override fun fromJSON(value: String): Element {
            TODO("Not yet implemented")
        }
    }
}

fun main() {
    Utils.utilMethod()
    println(Store.Check.calculate())
}
