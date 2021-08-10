package kotlinbasics.oop.inheritence

open class Animal {

    fun eat(){

        println("this animal is eating")
    }

    fun drink(){

        println("this animal is drinking")
    }

    fun walk(){

        println("this animal is walking")
    }
}

class Cat : Animal() {

    fun size(){

        println("this animal is small in size")
    }

    fun color(){

        println("this animal color is gray")
    }
}

class Cow : Animal() {

    fun size(){

        println("this animal is big in size")
    }

    fun color(){

        println("this animal color is black and white")
    }
}

fun main() {

    val cat = Cat()
    cat.eat()
    cat.drink()
    cat.walk()
    cat.size()
    cat.color()

    val cow = Cow()
    cow.eat()
    cow.drink()
    cow.walk()
    cow.size()
    cow.color()
}