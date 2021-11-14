package ch07

object LazyInit {
    val lazyString: String by lazy { getStringLazy() }
    val notLazyInt = 23

    private fun getStringLazy() = "I'm initialized"
}

fun main() {
    println("Start")
    val obj = LazyInit
    println(obj.notLazyInt)
    println(obj.lazyString)
}
