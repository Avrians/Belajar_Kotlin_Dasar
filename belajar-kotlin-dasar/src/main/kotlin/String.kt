fun main() {
    var firstName: String = "Eko"
    var lastName: String = "Nugroho"

    var address: String = """
        |Jalan beluk jadi
        |kabupaten 
        |provinsi
    """.trimMargin()
    var address2: String = """
        >Jalan beluk jadi
        >kabupaten 
        >provinsi
    """.trimMargin(">")
    var address3: String = """
        Jalan beluk jadi
        kabupaten 
        provinsi
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(address)
    println(address2)
    println(address3)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var decs: String = "$fullName length = ${fullName.length}"
    println(decs)
}