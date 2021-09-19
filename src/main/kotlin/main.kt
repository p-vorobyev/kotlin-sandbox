open class Lion(private val name: String,
                private val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

val authors = setOf("Shakespeare", "Hemingway", "Twain")
val writers = setOf("Twain", "Shakespeare", "Hemingway")

fun main(args: Array<String>) {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()

    println(authors == writers)
    println(authors === writers)
}
