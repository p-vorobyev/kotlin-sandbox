package ch05

import сh01.Person

fun main() {
    val persons = listOf(Person("Pavel", 32), Person("Human1"), Person("Human2"))
    //only for big collections.
    val pPersons = persons.asSequence()
        .map { it::name }
        .filter { it.get().startsWith("P") }
        .toList()
    assert(pPersons.size == 1)

    //generateSequence(0, { it + 1 })
    val naturalNaumbers = generateSequence(0) { it + 1 }
    val numTo100 = naturalNaumbers.takeWhile { it <= 100 }
    //nothing happens until sum(). like observable :)
    println(numTo100.sum())
}
