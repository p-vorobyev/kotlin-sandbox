package ch04

import java.util.concurrent.atomic.AtomicInteger

// "by" operator provide element for delegating and now we can override
class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet()
): MutableCollection<T> by innerSet {

    val insertCounter: AtomicInteger = AtomicInteger(0)

    override fun add(element: T): Boolean =
        innerSet.add(element) &&
                insertCounter.incrementAndGet() == 1

    override fun addAll(elements: Collection<T>): Boolean =
        innerSet.addAll(elements) &&
                insertCounter.addAndGet(elements.size) == elements.size
}

fun main() {
    val countingSet = CountingSet<Int>()
    countingSet.add(1)
    countingSet.addAll(listOf(1,2,2,3,4,5,5,6))
    println("Element insertions - ${countingSet.insertCounter.get()}; elements were added - ${countingSet.size}.")
}
