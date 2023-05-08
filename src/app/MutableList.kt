package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Syafiq")
    mutableList.add("Emha")
    mutableList.add("Budi")

    // mutableList[0] = "Joko"
    // mutableList.remove("Emha")

    for(i in mutableList) {
        println(i)
    }

    println(mutableList.isEmpty())
}