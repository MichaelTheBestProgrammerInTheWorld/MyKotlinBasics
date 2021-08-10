package kotlinbasics.oop

class AddClass {

    fun add(num1:Int, num2:Int){

        val result = num1 + num2
        println("sum of $num1 and $num2 is $result")
    }

    fun getSquare(number:Int):Int{

        return number*number
    }

    class NestedClass {

        fun nested(){
            println("this is a function inside a nested class")
        }
    }
}

fun main() {

    val obj = AddClass()
    obj.add(25, 25)
    val number = 10
    println("the square of $number is ${obj.getSquare(number)}")
    val nestedObj = AddClass.NestedClass()
    nestedObj.nested()
}