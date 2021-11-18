package ch10.serializers

interface ValueSerializer<T> {

    fun toJsonValue(obj: T): String?

    fun fomJsonValue(json: String?): T

}
