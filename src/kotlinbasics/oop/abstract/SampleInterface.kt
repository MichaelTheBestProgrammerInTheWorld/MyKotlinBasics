package kotlinbasics.oop.abstract


interface SampleInterface {

    /*
    Difference between Java and Kotlin in Interface
    1. In Kotlin an interface can contain both normal and abstract methods
    2. In Kotlin you can define both constants(val) and variables but you
    cannot initialize them inside the interface but in the class
    that implements the interface
     */

    val myVal:String
    abstract fun myFun()
    fun normal(){
        println("this is normal function inside interface")
    }
}

class SampleClass : SampleInterface {

    override val myVal: String
        get() = "I am giving value"

    override fun myFun() {

        println("I am giving implementation")
    }
}

fun main() {

    val obj = SampleClass()
    println(obj.myVal)
    obj.myFun()
    obj.normal()

}