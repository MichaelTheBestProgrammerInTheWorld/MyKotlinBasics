package kotlinbasics

fun main() {

    //can carry any value
    val a = arrayOf(52, 22, 88, 70, 73)
    val a3 = arrayOf("abc", "bcd", "cde", "def", "efg")
    val a4 = arrayOf("abc", "def", 6, 7, 'M')

    //can carry integer only
    val a2 = arrayOf<Int>(15, 19, 22, 27, 32)
    val a6 = intArrayOf(1, 2, 3, 4, 5)

    //can carry string only
    val a5 = arrayOf<String>("abcd", "sdfg")

    /*declare without giving values
    you should specify the data type of values
    you should specify a default value in between the curly brackets
     */
    val a7 = Array<Int>(5){999}
    val a8 = Array<String>(5){"0"}

    println(a[0])
    a[0] = 5
    println(a[0])
    a.set(0, 8)
    println(a[0])
    println(a.get(2))
    for (i in a){
        println("array A items are $i")
    }
    for (i in 0..a.size-1){
        println("array A index is : $i and value of this index is : " + a[i])
    }

    a7[1] = 86
    a7.set(2, 98)
    for (i in a7){
        println("A7 arrays is $i")
    }
}