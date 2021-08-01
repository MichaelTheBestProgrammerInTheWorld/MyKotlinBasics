package kotlinbasics.loops

fun main() {

    for (i in 1..10){
        if (i == 6){
            break
        }
        println(i)
    }

    println("end of loop")

    for (i in 1..10){
        if (i == 6){
            continue
        }
        println(i)
    }
}