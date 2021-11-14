package ch07

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext(): Boolean {
            return current <= endInclusive
        }

        override fun next(): LocalDate {
            return current.apply { current = plusDays(1) }
        }
    }

fun main() {
    val now = LocalDate.now()
    val vacation: ClosedRange<LocalDate> = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)

    val newYear = LocalDate.ofYearDay(2020, 1)
    val daysOff = newYear.minusDays(5)..newYear
    for (day in daysOff) {
        println(day)
    }
}
