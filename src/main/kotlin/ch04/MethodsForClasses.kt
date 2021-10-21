package ch04

class Client(
    val name: String,
    val postalCode: Int
    ) {
    override fun toString(): String {
        return "Client(name='$name', postalCode=$postalCode)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }

}

data class ClientData(
    val name: String,
    val postalCode: Int
)

fun main() {
    val client = Client("Pavel", 105275)
    println(client.toString())
    println(client.hashCode())
    val client1 = Client("Pavel", 105275)
    //Operator "==" check equality of objects, not links. It will be compiled to equals().
    println(client == client1)

    val client2 = client1
    //compares links
    println(client2 === client1)

    val clientData = ClientData("User", 12345)
    println(clientData.toString())
    val clientData1 = clientData.copy(postalCode = 9876)
    println(clientData == clientData1)
}
