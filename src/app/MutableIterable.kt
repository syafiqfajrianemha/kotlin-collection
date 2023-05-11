package app

fun <T> displayMutableIterable(mutableIterable: MutableIterable<T>) {
    val iterator = mutableIterable.iterator()
    while(iterator.hasNext()) {
        // iterator.remove() // menghapus data di iterasi saat ini
        println(iterator.next())
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Syafiq", "Fajrian", "Emha"))
}