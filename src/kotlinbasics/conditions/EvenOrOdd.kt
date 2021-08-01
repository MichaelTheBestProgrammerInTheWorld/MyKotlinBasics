package kotlinbasics.conditions

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Please enter any number")
    val inputNum = scanner.nextInt()
    val result = if (inputNum%2 == 0) {
        "Number you've entered is Even"
    } else {
        "Number you've entered is Odd"
    }
    println(result)
}