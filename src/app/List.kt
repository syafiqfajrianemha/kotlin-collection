package app

/*
List, adalah collection yang datanya seperti Array dan memiliki akses data menggunakan index
Data di List boleh duplicate, artinya kita boleh memasukkan data yang sama berkali-kali ke dalam sebuah List yang sama
 */
fun main() {
    // default list adalah immutable atau tidak bisa diubah datanya
    val list: List<String> = listOf("Syafiq", "Fajrian", "Emha")

    println(list)
    println(list[0])
    println(list[1])
    println(list[2])
    println(list.isEmpty())
    println(list.indexOf("Fajrian"))
    println(list.indexOf("Budi"))
    println(list.contains("Emha"))
    println(list.isNotEmpty())
}