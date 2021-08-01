package kotlinbasics.conditions

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Please enter your age")
    val age = scanner.nextInt()
    val result = when(age){
        in 1..18 -> "You are a teenager"
        in 19..100 -> "You are an adult"
        else -> "Invalid Input"
    }

    println(result)
}