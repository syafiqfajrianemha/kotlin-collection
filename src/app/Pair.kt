package app

/*
- Pair adalah representasi dari data yang berpasangan
- Di Map, Pair digunakan sebagai data Map ketika pertama kali Map dibuat
 */
fun main() {
    val pair1 = Pair("Syafiq", "Emha")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Syafiq" to "Emha"
    println(pair2.first)
    println(pair2.second)
}