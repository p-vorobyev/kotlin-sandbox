package ch11

/*fun buildString(
    buildAction: (StringBuilder) -> Unit
): String {
    val sb = StringBuilder()
    buildAction(sb)
    return sb.toString()
}*/

fun buildString(
    buildAction: StringBuilder.() -> Unit
): String {
    val sb = StringBuilder()
    //sb.buildAction()
    buildAction(sb)
    return sb.toString()
}

fun main() {
    val s = buildString {
        this.append("hello")
        append(" ")
        append("world!")
    }
    println(s)
}
