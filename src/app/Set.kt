package app

import data.Person

fun main() {
    // secara default set itu immutable atau tidak bisa dirubah
    val set: Set<Person> = setOf(
        Person("Syafiq"),
        Person("Fajrian"),
        Person("Emha"),
        Person("Syafiq"),
        Person("Fajrian"),
    )

    println(set.size)
    println(set.contains(Person("Syafiq")))

    for(person in set) {
        println(person)
    }
}