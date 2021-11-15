package ch08

import сh01.Person

fun lookForAlice(peoples: List<Person>) {
    peoples.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }
    //printed only when not found
    println("Alice not found.")
}

fun lookForAliceWithLabel(peoples: List<Person>) {
    peoples.forEach label@{
        if (it.name == "Alice") {
            println("Found!")
            return@label
        }
    }
    //printed always because of @label above
    println("Alice might be somewhere.")
}

fun main() {
    val peoples = listOf(Person("Bob"), Person("Alice"))
    lookForAlice(peoples)
    lookForAliceWithLabel(peoples)
}
