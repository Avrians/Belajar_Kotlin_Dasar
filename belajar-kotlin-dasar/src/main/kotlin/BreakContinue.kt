fun main() {

    var i = 0

    while (true) {
        println("Hello ke $i")
        i++

        if (i > 10) {
            break
        }
    }

    for (i in 1..50) {
        if (i % 2 == 0) {
            continue
        }

        println("Angka $i")
    }
}