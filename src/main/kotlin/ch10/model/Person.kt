package ch10.model

import ch10.annotations.CustomSerializer
import ch10.annotations.DeserializeInterface
import ch10.annotations.JsonExclude
import ch10.annotations.JsonName
import ch10.serializers.DateSerializer
import java.util.*

data class Person(@JsonName("alias") val name: String,
                  @JsonExclude val age: Int? = null,
                  @CustomSerializer(DateSerializer::class) val birth: Date? = null,
                  @DeserializeInterface(CompanyImpl::class) val company: Company)
