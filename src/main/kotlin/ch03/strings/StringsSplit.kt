package ch03.strings

fun parsePath(path: String) {
    val dir = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val ext = fullName.substringAfterLast(".")
    println("""
        Dir: $dir
        Name: $fileName
        Extension: $ext
    """.trimIndent())
}

fun parsePathRegexInside(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (dir, fileName, ext) = matchResult.destructured
        println("Dir: $dir, name: $fileName, ext: $ext")
    }
}

fun main() {
    val path = "/users/voroby/document/topSecret.txt"
    parsePath(path)
    println("---")
    parsePathRegexInside(path)
}
