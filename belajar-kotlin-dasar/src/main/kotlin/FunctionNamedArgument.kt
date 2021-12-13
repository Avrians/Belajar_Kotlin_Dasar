fun fullName (firstName: String, middleName: String, lastName: String) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Eko", "Kurniawan", "Nugraha")
    fullName(
        lastName = "Nugroho", firstName = "Eko", middleName = "Kurniawan"
    )
}