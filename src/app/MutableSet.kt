package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()

    mutableSet.add(Person("Syafiq"))
    mutableSet.add(Person("Fajrian"))
    mutableSet.add(Person("Emha"))
    mutableSet.add(Person("Syafiq"))

    println(mutableSet.size)

    for(person in mutableSet) {
        println(person)
    }
}