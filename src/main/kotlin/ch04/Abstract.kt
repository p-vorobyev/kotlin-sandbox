package ch04

import java.util.concurrent.TimeUnit

abstract class Animal(
    var isGreet:  Boolean = false
) {
    abstract fun greeting()

    open fun stopGreeting() {
        isGreet = false
        println("Bye!")
    }

    fun eatPeople() = println("Mmm, delicious!")
}

class Dog: Animal() {

    override fun greeting() {
        isGreet = true
        while (isGreet) {
            println("Wuf wuf...")
            TimeUnit.SECONDS.sleep(1)
        }
    }
}

fun main() {
    val dog = Dog()
    Thread { dog.greeting() }.start()
    TimeUnit.SECONDS.sleep(5)
    dog.stopGreeting()
}
