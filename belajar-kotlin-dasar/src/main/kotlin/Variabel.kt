const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    var firstName = "Eko"
    val age = 30

    println(firstName)
    println(age)

    var name: String? = null
    name = "Eko"
    println(name)
    println(name?.length)

    println("$APP : $VERSION")
}