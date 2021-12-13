fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTranform = transformer(name)
        return "Hello $nameTranform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "Semua"
        }else {
            return value.toUpperCase()
        }
    }

    println(hello("Eko", upper))
    println(hello("", upper))

    println(hello("Kurniawan", fun(value: String): String {
        return value.toLowerCase()
    }))
}