package ch05

fun alphabet(): String {
    val builder = StringBuilder()
    return with(builder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        builder.toString()
    }
}

fun alphabet1() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        this.append(letter)
    }
    append("\nNow I know the alphabet!")
    this.toString()
}

fun alphabet2() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        this.append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun alphabet3() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun main() {
    println(alphabet())
    println(alphabet1())
    println(alphabet2())
    println(alphabet3())
}
