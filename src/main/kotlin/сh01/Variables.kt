package сh01

fun main(args: Array<String>) {
    val message: String = if (canPerformOperation()) "Success" else "Fail"
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
    println(message)
    println(languages)
    println("Hello, ${getName(args)}!")
}

private fun canPerformOperation() = true

private fun getName(strings: Array<String>): String {
    return if (strings.isNotEmpty())
        strings[0]
    else
        "Kotlin"
}
