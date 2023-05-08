package app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for(item in collection) println(item)
}

fun main() {
    displayCollection(mutableListOf("Syafiq", "Emha"))
    displayCollection(mutableSetOf("Syafiq", "Emha"))
    displayCollection(mutableMapOf("Syafiq" to "Emha").entries)
}