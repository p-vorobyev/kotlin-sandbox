package ch03

class User(
    val id: Int,
    val name: String,
    val address: String
)

fun User.validateBeforeSave() {
    fun validateField(value: String, fieldName: String) {
        if (value.isBlank()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }
    validateField(name, "Name")
    validateField(address, " Address")
}

fun main() {
    val user = User(1, "Pavel", "Moscow")
    try {
        user.validateBeforeSave()
    } catch (e: IllegalArgumentException) {
        println(e.cause?.message)
    }
}
