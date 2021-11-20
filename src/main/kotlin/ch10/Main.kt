package ch10

import ch10.model.Person
import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

fun main() {
    val person = Person("Alice", 10)
    val kClass: KClass<Person> = person.javaClass.kotlin

    println(kClass.simpleName)

    kClass.memberProperties.forEach { println(it.name) }

    //kClass.members.forEach { println(it.name) }

    val kFunction = ::foo
    kFunction.invoke(3) // with type check
    kFunction.call(3) // without type

    val kFunction2 = ::sum

    var kProperty1 = Person::age
    println(kProperty1.get(person))

}

fun sum(x: Int, y: Int) = x + y

fun foo(i: Int) = println(i)
