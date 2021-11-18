package ch10.serializers

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.util.*

internal class DateSerializerTest {

    @Test
    fun serialize() {
        val date = Date()
        val json = DateSerializer.toJsonValue(date)
        val date1 = DateSerializer.fomJsonValue(json)
        assertTrue(date.equals(date1))
    }
}
