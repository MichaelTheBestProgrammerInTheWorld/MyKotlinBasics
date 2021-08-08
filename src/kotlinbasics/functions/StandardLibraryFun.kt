package kotlinbasics.functions

fun main() {

    /* functions like main(), Math.sqrt(), Math.pow()
    are predefined in kotlin and programmer can directly call them
     */

    val num:Double = 25.0
    val squareRoot = Math.sqrt(num)
    val square = Math.pow(num, 2.0)
    println("The square root of $num is : $squareRoot and the square of it is : $square")

}