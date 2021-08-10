package kotlinbasics.oop.constructor



class SecondaryConstructor {

    constructor(){

        println("this is empty constructor")
    }

    constructor(name:String){

        println("Your name is $name")
    }

    constructor(name:String, id:Int = 10){

        println("Your name is $name and your id is $id")
    }
}

fun main() {

    val obj1 = SecondaryConstructor()
    val obj2 = SecondaryConstructor("Michael")
    val obj3 = SecondaryConstructor("Name", 25)
}

