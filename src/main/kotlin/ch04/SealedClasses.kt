package ch04

sealed class Expr {}

class Num(val value: Int) : Expr()

class Sum(val left: Expr, val right: Expr) : Expr()

/*
* No need else branch, because all cases of the sealed class are presented
*/
fun evalValue(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> evalValue(e.left) + evalValue(e.right)
    }
