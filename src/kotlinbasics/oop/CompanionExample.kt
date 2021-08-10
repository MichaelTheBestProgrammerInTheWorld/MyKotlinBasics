package kotlinbasics.oop

class CompanionExample {


    //equivalent to static in Java
    companion object {

        var companionCounter = 0

        fun companionFunction(){
            println("this is companion function")
        }
    }
}

fun main() {

    val obj = CompanionExample
    println("companion counter is ${++obj.companionCounter}")
    val obj2 = CompanionExample
    println("companion counter is ${++obj2.companionCounter}")
}