package variables

/**
 * Created by micha on 10.10.2016.
 */

//val a
val a = 1
//var b = null
var b = 5 // jest zmienna

fun main(args: Array<String>) {
    var c = 120
    var d: Byte = 120
    val e = 120
    //val f: String = 120
    for (i in 0..9) {
        //println(e++)
        println(c++)
    }
    println()
    for (i in 0..9) {
        println(d++)
    }
    var f = 'A'
    var g = "A"
    for (i in 0..9) {
        println(f++)
        //println(g++)
    }
    for (i in 0..9) {
        //println(g++)
    }
//    if(f==g)
//        print()
//    if(d==e)
//        print()
    var x = 1
    var y: String = "1"
    var z = x
//    if(x==y)
//        println(true)
    if(x.equals(y))
        println("x.equals(y)")
//    if(x===y)
//        println(true)
    if(x===z)
        println(true)
    if(x.equals(y.toInt()))
        println("x.equals(y.toInt())")
}