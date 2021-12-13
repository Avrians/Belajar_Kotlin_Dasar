fun main() {

    var nilai = "A"

    when (nilai) {
        "A" -> println("Amazing")
        "B" -> {
            println("Good")
        }
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        else -> println("Try Again")
    }

    when (nilai) {
        // if(nilai == "a" || nilai == "b" || nilai == "c")
        "A", "B", "C" -> println("Anda Lulus")
        else -> {
            println("Maaf anda tidak lulus")
        }
    }

    nilai = "E"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when(nilai) {
        in nilaiLulus -> println("Selamat anda lulus")
        !in  nilaiLulus -> println("Maaf, anda gagal")
    }

    val name ="eko"
    when(name) {
        is String -> println("Nama is String")
        !is String -> println("Name is not String")
    }

    val nilaiUjian = 90
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Remidial")
    }
}