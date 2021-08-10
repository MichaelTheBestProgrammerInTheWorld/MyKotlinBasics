package kotlinbasics.oop


class ExtensionFunction(val num1:Int, val  num2:Int) {

    fun add():Int {

        return num1+num2
    }
}

fun ExtensionFunction.multiply():Int {

    return num1*num2
}

fun main() {

    val obj = ExtensionFunction(5, 10)
    println(obj.add())
    println(obj.multiply())
}