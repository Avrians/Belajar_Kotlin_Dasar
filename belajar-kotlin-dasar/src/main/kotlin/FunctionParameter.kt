
fun sayHello(name:String, lastName: String? ) {
    if (lastName == null) {
        println("Hello $name")
    } else {
        println("Hello $name $lastName")
    }
}

fun main() {
    sayHello("Eko", "Kurniawan")
    sayHello("Budi", null)
    sayHello("Joko", "Nugroho")
}