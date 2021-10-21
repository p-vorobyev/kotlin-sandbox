package ch04

interface SocialNetworkUser {
    val nickName: String
}

class PrivateUser(override val nickName: String): SocialNetworkUser

class SubscribingUser(val email: String): SocialNetworkUser {
    override val nickName: String
        get() = email.substringBefore("@")
}

class FacebookUser(val id: Int): SocialNetworkUser {
    override val nickName: String
        get() = getNickName(id)

    private fun getNickName(id: Int): String = "User$id"
}


