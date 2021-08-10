package kotlinbasics.oop.constructor



class PrimaryConstructor(val name:String,  rollNo:Int = 888) {

    /*
    you can initialize a primary constructor only inside init block
     */
    init {

        println("My name is $name")
        println("My roll no. is $rollNo")
    }
}

fun main() {

    val student = PrimaryConstructor("Michael")
    /*
    if you add val to parameters in constructor declaration they
    will be accessible from here too
     */
    println("Hello world this is ${student.name} again")
    /*
    student.rollNo   this line will cause error because I didn't
    add val to rollNo param in the declaration
     */
}
