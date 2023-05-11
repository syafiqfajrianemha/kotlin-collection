package app

/*
- Iterable adalah superclass dari Collection interface
- Iterable adalah general operation untuk melakukan iterasi seluruh data di collection, atau menghapus data di collection
 */
fun <T> displayIterable(iterable: Iterable<T>) {
    /*for(value in iterable) {
        println(value)
    }*/

    val iterator = iterable.iterator()
    while(iterator.hasNext()) println(iterator.next())
}

fun main() {
    displayIterable(listOf("Syafiq", "Fajrian", "Emha"))
    displayIterable(setOf("Syafiq", "Fajrian", "Emha", "Fajrian"))
}