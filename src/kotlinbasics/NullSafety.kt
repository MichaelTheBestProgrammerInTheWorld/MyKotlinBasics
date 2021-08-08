package kotlinbasics

fun main() {

    var sampleVar:String?
    sampleVar = null //if we remove this line a compile time error will show

    println(sampleVar?.length)

    val length:Any = sampleVar?.length ?: "Unknown"
    println("The length of the string is $length")

}