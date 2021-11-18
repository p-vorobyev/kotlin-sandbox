package ch10.annotations

import ch10.serializers.ValueSerializer
import kotlin.reflect.KClass

//in Kotlin by default retention is RUNTIME

// PROPERTY type will not work with Java
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
annotation class JsonExclude


@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
annotation class JsonName(val name: String)


@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
annotation class DeserializeInterface(val targetClass: KClass<out Any>)


@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
annotation class CustomSerializer(val targetClass: KClass<out ValueSerializer<*>>)


@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class BindingAnnotation


@BindingAnnotation
annotation class MyBinding


