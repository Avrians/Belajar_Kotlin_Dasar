fun main() {

    var array = arrayOf("Eko", "Akmal","Syahrul", "Budi")

    var total = 0
    for (name in array) {
        println(name)
        total++
    }
    println("Total Perulangan = $total")

    for (i in 100 downTo 0  step 2) {
        println(i)
    }

    val ukuranArray = array.size -1
    for (i in 0..ukuranArray) {
        println("index $i = ${array.get(i)}")
    }
}