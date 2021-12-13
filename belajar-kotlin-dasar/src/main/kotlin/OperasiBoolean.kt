fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 60
    val nilaiEkstra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusEktra = nilaiEkstra > 75

    val apakahLulus = apakahLulusAbsen && apakahLulusUjian && apakahLulusEktra
    // val apakahLulus = ((apakahLulusAbsen && apakahLulusUjian) && apakahLulusEktra)

    println(apakahLulus)
}