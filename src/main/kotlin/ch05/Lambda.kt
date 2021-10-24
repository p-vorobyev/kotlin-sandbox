package ch05

import сh01.Person
import java.util.function.Consumer

fun maxAgePerson(persons: List<Person>): Person? =
    persons.maxByOrNull { it.age!! }

fun personsNames(persons: List<Person>): String =
    persons.joinToString(separator = " ", transform = {p -> p.name})
    //persons.joinToString(separator = " ") {p: Person -> p.name}

// use local not final variables
fun printWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach { println("$prefix $it") }
}

// change local variables from lambda
fun printProblemsCount(resp: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    resp.forEach {
        if (it.startsWith("4"))
            clientErrors++
        if (it.startsWith("5"))
            serverErrors++
        println("$clientErrors client errors, $serverErrors server errors.")
    }
}

interface Button {
    fun onClick(consumer: Consumer<Unit>)
}

/*
incorrect use!!! will always return 0. onClick will be called after exit from function.
in this case we should store variable outside the function
*/
fun onButtonClicks(button: Button): Int {
    var clicks = 0
    button.onClick { clicks++ }
    return clicks
}

fun canBeInClub27() = { p: Person -> p.age!! >= 27 }

fun main() {
    val sum = { x: Int, y: Int ->
        println("Sum of $x and $y...")
        x + y
    }
    println(sum(5, 7))
    run { println("hello, lambda") }

    val persons = arrayListOf(
        Person("Pavel", 32),
        Person("Anatoliy", 56)
    )
    println(personsNames(persons))
    println(maxAgePerson(persons))

    printWithPrefix(listOf("hello!", "bye!"), "message: ")
}
