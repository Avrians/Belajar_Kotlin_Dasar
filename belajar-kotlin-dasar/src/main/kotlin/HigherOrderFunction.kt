fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTranform = transformer(name)
        return "Hello $nameTranform"
    }

    val lambdaUpper = { value: String -> value.toUpperCase()}
    println(hello("Eko", lambdaUpper))

    println(hello("Eko",{ value: String -> value.toLowerCase()} ))

    val result1 = hello("Eko",{ value: String -> value.toLowerCase() })
    val result2 = hello("Eko") {value: String ->
        value.toLowerCase()}

}