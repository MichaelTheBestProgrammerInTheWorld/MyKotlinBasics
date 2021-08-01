package kotlinbasics.loops

fun main() {

    val txt = "Namaste"
    for (i in txt){
        println(i)
    }

    for (i in 1.. txt.length){
        println(i)
    }

    for (i in txt.withIndex()){
        println("${i.index} : ${i.value}")
    }
}