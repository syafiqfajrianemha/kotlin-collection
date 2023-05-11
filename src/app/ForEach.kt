package app

fun main() {
    listOf("Syafiq", "Fajrian", "Emha").forEach {
        println(it)
    }

    mutableListOf("Syafiq", "Fajrian", "Emha").forEachIndexed() { index, value ->
        println("$index = $value")
    }
}