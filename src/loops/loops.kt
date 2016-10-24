package loops

/**
 * Created by micha on 21.10.2016.
 */

fun main(args: Array<String>) {
    repeat(10) {
        print("repeat10")
    }
    println()
    for (i in 0..10) {
        print(i)
    }
    println()
    val list = listOf("A", "B", "C")
    for(str in list) {
        print(str)
    }
    println()
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    for ((key, value) in map) {
        println("Map[$key] = $value")
    }
    map.forEach {
        print(it.key)
    }
    println()
    (1..5).forEach(::print)
    println()
    var i = 0
    while (i < 10) {
        print("while = $i, ")
        i++
    }
    println()
    do {
        println("do while")
    } while (1 > 10)
}