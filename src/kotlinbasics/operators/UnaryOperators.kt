package kotlinbasics

fun main() {

    var count = 5
    println("initial count = $count")
    count++
    println("increment count = $count")
    count+3  //not stored = not effective
    println("add 3 count = $count")
    count+1  //not stored = not effective
    println("add 1 count = $count")
    count+=3
    println("add 3 count = $count")

    count--
    println("decrement count = $count")
    count-3  //not stored = not effective
    println("minus 3 count = $count")
    count-1  //not stored = not effective
    println("minus 1 count = $count")
    count-=3
    println("minus 3 count = $count")
}