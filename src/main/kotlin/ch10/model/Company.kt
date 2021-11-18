package ch10.model

interface Company {
    val name: String
}

data class CompanyImpl(override val name: String): Company
