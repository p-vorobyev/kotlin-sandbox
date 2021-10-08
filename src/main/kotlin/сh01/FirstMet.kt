package сh01

data class Person(val name: String,
                  val age: Int? = null)

fun maxInt(a: Int, b: Int): Int = if (a > b) a else b

fun main() {
    val persons = listOf(Person("Alice"), Person("Bob", 29))
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    if (oldest is Person) {
        println("The oldest is: $oldest")
    }
}
