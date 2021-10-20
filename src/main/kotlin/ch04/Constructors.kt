package ch04

open class User(val nickName: String) {
    init {
        println("Hello, $nickName!")
    }
}

class TwitterUser(nickName: String): User(nickName)

class SecretUser private constructor(): User(nickName = "secret")

// secondary constructors
open class SecondaryConstructor {
    constructor(value: String) {
    }

    constructor(value: String, value1: Int?) {
    }
}

class SecondaryImpl: SecondaryConstructor {
    constructor(value: String) : this(value, null) {
    }

    constructor(value: String, value1: Int?) : super(value, value1) {
    }
}

fun main() {
    val twitterUser = TwitterUser("Pavel")
}
