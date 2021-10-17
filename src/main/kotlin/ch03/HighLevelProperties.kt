package ch03

var count = 0

fun someOperation() = count++

fun reportOperationCount() =
    println("Operation performed ${ch03.count} times.")

const val UNIX_LINE_SEPARATOR = "\n"
