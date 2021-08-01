package kotlinbasics.loops

fun main() {

    var i = 1

    do {
        println(i)
        i++
    } while (i<0)

    println("end of loop")

    do {
        println(i)
        i++
    } while (i<10)

    println("end of loop")

    var j = 10

    do {
        println(j)
        j--
    } while (j<1)

    println("end of loop")

    do {
        println(j)
        j--
    } while (j>1)
}