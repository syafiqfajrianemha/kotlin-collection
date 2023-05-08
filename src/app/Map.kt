package app

/*
- Map (atau dictionary), adalah collection yang berbentuk key-value, dimana key berperan sebagai index.
- Key harus unik, jika kita menggunakan Key yang sama, maka data sebelumnya akan di replace oleh data yang baru
- Tipe data key bisa menggunakan tipe data apapun sesuai yang kita inginkan
 */
fun main() {
    // default map itu immutable atau tidak bisa dirubah
    val map: Map<String, String> = mapOf(
        Pair("a", "Syafiq"),
        "b" to "Syafiq",
        "c" to "Emha",
    )

    println(map.containsValue("Emha"))

    for((key, value) in map) {
        println("$key to $value")
    }
}