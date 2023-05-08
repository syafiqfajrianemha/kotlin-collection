package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()

    // menambah atau mengubah data
    mutableMap.put("a", "Syaiq")
    mutableMap["b"] = "Fajrian"
    mutableMap["c"] = "Emha"

    println(mutableMap["a"])
    println(mutableMap.get("b"))
    println(mutableMap.get("c"))
    println(mutableMap.getOrDefault("d", "Tidak ada"))
    println(mutableMap.get("d"))

    mutableMap.remove("b")

    for((key, value) in mutableMap) {
        println("$key to $value")
    }
}