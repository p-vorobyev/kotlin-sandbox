package ch04

import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrentState(): State

    fun setState(state: State)
}

class Button1: View {
    override fun getCurrentState(): State {
        return ButtonState()
    }

    override fun setState(state: State) {
        /*...*/
    }

    //the same as nested static class in java
    class ButtonState: State {/*...*/}
}

class Outer(val someValue: String) {

    // inner class
    inner class Inner {

        //return outer class reference
        fun getOuterReference(): Outer {
            return this@Outer
        }

    }
}
