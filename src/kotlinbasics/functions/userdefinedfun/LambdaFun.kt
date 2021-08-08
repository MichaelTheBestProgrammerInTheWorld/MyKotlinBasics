package kotlinbasics.functions.userdefinedfun

fun main() {

    val myLambda:(Int)->Unit = {
        name:Int -> println("The sum of two numbers is $name")
    }
    addingTwoNumbers(3, 5, myLambda)
}

fun addingTwoNumbers(num1:Int, num2:Int, mLambdaFun:(Int) -> Unit){

    val sum = num1 + num2

    mLambdaFun(sum)
}