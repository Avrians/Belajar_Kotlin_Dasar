fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    val contohLambda: (String, String) -> String = {
            fistName: String, lastName: String ->
        val result = "$fistName $lastName"
        result
    }
    val result = contohLambda("Eko", "Kurniawan")
    println(result)

     val sayHello: (String) -> String = {
         "Hello $it"
     }
    println(sayHello("Eko"))

    val toUpperCas : (String) -> String = ::toUpper
    println(toUpperCas("eko kurniawan"))
}