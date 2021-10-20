package ch04

internal open class TalkActiveButton {

    private fun yell() = println("Hey!")

    //visible only from subclasses
    protected fun talk() = println("let's talk")

    fun bye() = println("bye!")

}

// access error
/*fun TalkActiveButton.giveSpeach() {
    yell()
    talk()
}*/

internal class HelloButton: TalkActiveButton() {

    fun bla() {
        this.giveSpeech()
    }

}

internal fun TalkActiveButton.giveSpeech() {
    bye()
}

fun main() {
    val helloButton = HelloButton()
    helloButton.bla()
}

