@file:JvmName("StringFunctions")
package ch03.strings

import java.lang.StringBuilder

//to overload method with all variants of default parameters to call from java
@JvmOverloads
fun <T> joinToString(collection: Collection<T>,
                     separator: String = ",",
                     prefix: String = "[",
                     postfix: String = "]"): String {
    val result = StringBuilder(prefix)
    for ((index, value) in collection.withIndex()) {
        if (index > 0)
            result.append(separator)
        result.append(value)
    }
    result.append(postfix)
    return result.toString();
}
