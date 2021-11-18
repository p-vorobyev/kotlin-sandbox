package ch10.serializers

import java.time.Instant
import java.util.*

private fun Any?.expectNumber(): Number {
    if (this !is Number) throw IllegalArgumentException("Expected number, was: $this")
    return this
}

object DateSerializer: ValueSerializer<Date> {
    override fun toJsonValue(obj: Date): String? {
        val epochMilli = obj.toInstant().toEpochMilli()
        return epochMilli.expectNumber().toString()
    }

    override fun fomJsonValue(json: String?): Date {
        val long = json?.toLong() ?: 0L
        return Date.from(Instant.ofEpochMilli(long))
    }
}
