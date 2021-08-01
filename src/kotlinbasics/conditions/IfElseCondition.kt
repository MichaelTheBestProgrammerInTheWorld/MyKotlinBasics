package kotlinbasics.conditions

fun main() {

    val x = 20
    val y = 10

    //normal if statement
    if (x>y){
        println("X is greater than Y")
    } else {
        println("Y is greater than X")
    }

    //storing if expression in a variable
    val myResult = if (x>y){
        x
    } else {
        y
    }

    println(myResult)
}