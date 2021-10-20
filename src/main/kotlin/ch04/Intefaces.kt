package ch04

interface Clickable {

    fun click()

    fun whoAmI() = println("I'm clickable!")

}

interface Focusable {

    fun whoAmI() = println("I'm focusable!")

}

class Button: Clickable, Focusable {

    override fun click() = println("clicked!")

    override fun whoAmI() {
        super<Clickable>.whoAmI()
        super<Focusable>.whoAmI()
    }

}

open class RichButton: Clickable {

    fun disabledFunction() = println("i'm disabled for override")

    open fun animate() {
        println("animated")
    }

    override fun click() {
        println("click from parent")
    }

}

class ButtonChild: RichButton() {

    override fun whoAmI() = println("I'm richButton!")

    override fun animate() {
        println("animate child button")
    }

    override fun click() {
        println("child click")
    }

}

fun main() {
    val button = Button()
    button.click()
    button.whoAmI()

    val richButton: RichButton = ButtonChild()
    richButton.animate()
}
