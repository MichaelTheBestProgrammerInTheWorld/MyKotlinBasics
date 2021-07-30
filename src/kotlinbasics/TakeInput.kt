package kotlinbasics

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Please enter your name")
    val name = scanner.nextLine()
    println("Please enter your age")
    val age = scanner.nextInt()
    println("Your name is $name and your age is $age")
}