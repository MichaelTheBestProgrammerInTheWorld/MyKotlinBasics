package kotlinbasics.oop.abstract


abstract class ParentClass {

    fun normalFunction(){

        println("this is normal function inside parent class")
    }

    abstract fun abstractFunction()
}

class ChildClass : ParentClass() {

    override fun abstractFunction() {
        println("now I am implementing the abstract function within the child class")
    }
}

fun main() {

    val obj = ChildClass()
    obj.normalFunction()
    obj.abstractFunction()
}