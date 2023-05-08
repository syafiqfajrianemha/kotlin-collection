package app

/*
- Semua data collection adalah turunan dari interface Collection
- Collection digunakan sebagai general operation terhadap struktur data collection, seperti membaca dan menulis data di collection
 */
fun <T> displayCollection(collection: Collection<T>) {
    for(item in collection) println(item)
}

fun main() {
    displayCollection(listOf("Syafiq", "Emha"))
    displayCollection(setOf("Syafiq", "Emha"))
    displayCollection(mapOf("Syafiq" to "Emha").entries) // map entries mengembalikan set
    // displayCollection(mapOf("Syafiq" to "Emha")) // error, Map bukan turunan Collection
}