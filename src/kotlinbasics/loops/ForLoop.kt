package kotlinbasics.loops

fun main() {

    //prints from 1 to 10
    for (i in 1..10){
        println(i)
    }

    println("end of loop")

    //prints from 1 to 9
    for (i in 1 until  10){
        println(i)
    }

    println("end of loop")

    //you cannot use until in decrementing
    for (i in 10 downTo 1){
        println(i)
    }

    println("end of loop")

    //you can step by 2, 3, 4, etc
    for (i in 1..10 step 2){
        println(i)
    }

    println("end of loop")

    for (i in 10 downTo 1 step 2){
        println(i)
    }
}