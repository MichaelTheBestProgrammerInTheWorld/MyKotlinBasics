package kotlinbasics.conditions

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Please enter a number from 1 to 7")
    val dayNum = scanner.nextInt()
    val day = when(dayNum){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Input"
    }

    println(day)
}