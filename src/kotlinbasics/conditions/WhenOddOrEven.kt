package kotlinbasics.conditions

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Please enter a number from 1 to 10")
    val inputNum = scanner.nextInt()
    val result = when(inputNum){
        1, 3, 5, 7, 9 -> "Number is Odd"
        2, 4, 6, 8, 10 -> "Number is Even"
        else -> "Invalid Input"
    }

    println(result)
}