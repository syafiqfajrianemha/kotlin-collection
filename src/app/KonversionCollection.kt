package app

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableSet = range.toMutableSet()
    val mutableList = range.toMutableList()

    val listToMutableList = list.toMutableList()
    val setToMutableList = list.toMutableSet()

    val sortedSet = array.toSortedSet()
}