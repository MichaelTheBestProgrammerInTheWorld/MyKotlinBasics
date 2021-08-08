package kotlinbasics.functions.userdefinedfun

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Please enter the first number")
    val num1 = scanner.nextInt()
    println("Please enter the second number")
    val num2 = scanner.nextInt()
    println(add(num1, num2))
    println(subtract(num1, num2))
    println(multiply(num1, num2))
}

fun add(num1:Int, num2:Int):Int {

    val result = num1 + num2
    return result
}

fun subtract(num1:Int, num2:Int):Int {

    val result = num1 - num2
    return result
}

fun multiply(num1:Int, num2:Int):Int {

    return num1 * num2
}