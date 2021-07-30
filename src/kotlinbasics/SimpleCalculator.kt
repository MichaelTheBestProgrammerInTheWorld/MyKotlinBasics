package kotlinbasics

import java.util.*

fun main() {

    println("Simple Calculator Program")
    val scanner = Scanner(System.`in`)
    println("Please enter first integer number")
    val firstNum = scanner.nextInt()
    println("Please enter second integer number")
    val secondNum = scanner.nextInt()

    val sum = firstNum + secondNum
    val subtract = firstNum - secondNum
    val multiply = firstNum * secondNum
    val divide = firstNum / secondNum

    println("sum = $sum")
    println("subtract = $subtract")
    println("multiply = $multiply")
    println("divide = $divide")

}