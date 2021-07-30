package kotlinbasics

import java.util.*

fun main() {

    println("Swap Two Numbers Program")
    val scanner = Scanner(System.`in`)
    println("Please enter first integer number")
    var firstNum = scanner.nextInt()
    println("Please enter second integer number")
    var secondNum = scanner.nextInt()

    println("numbers before swapping, first : $firstNum second : $secondNum")
    val container = secondNum
    secondNum = firstNum
    firstNum = container
    println("numbers before swapping, first : $firstNum second : $secondNum")
}