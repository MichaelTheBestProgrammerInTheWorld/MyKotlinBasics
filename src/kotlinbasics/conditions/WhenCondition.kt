package kotlinbasics.conditions

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Please enter a number from 1 to 10")
    val num = scanner.nextInt()
    val numInLetters = when(num){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        6 -> "Six"
        7 -> "Seven"
        8 -> "Eight"
        9 -> "Nine"
        10 -> "Ten"
        else -> "Invalid Input"
    }

    println("Number you've entered in letters is $numInLetters")
}