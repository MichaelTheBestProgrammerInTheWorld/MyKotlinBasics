package kotlinbasics

fun main() {

    val a = 50
    val b = 10
    val c = 50
    var result:Boolean

    result = a==b && a==c
    println(result)

    result = a==b || a==c
    println(result)

    result = !(a==b && a==c)
    println(result)

    result = !(a==b || a==c)
    println(result)
}