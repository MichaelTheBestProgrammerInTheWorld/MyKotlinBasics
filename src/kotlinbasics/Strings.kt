package kotlinbasics

fun main() {

    val str = "Welcome to Namaste Coder"
    var str2 = "Hello kotlin 888$ *&"
    str2 += "12345"
    val str3 = str + " " + str2
    println(str3)
    println(str.length)
    for (i in 0..str.length-1){
        println(str[i])
    }
    for (i in 0..12){
        print(str2.get(i))
    }
    println()

    val str4 = "hello world"
    val str5 = "hello world "
    val str6 = "Hello World"
    val str7 = "hello world"
    println(str4.equals(str))
    println(str4.equals(str5))
    println(str4.equals(str6))
    println(str4.equals(str7))
    println(str4.equals(str6, ignoreCase = true))

    println(str6[4])
    //substring trims the last index
    println(str6.substring(0, 4))
    println(str6.substring(0, 5))
    //subSequence do the exact same job as substring
    println(str6.subSequence(0, 4))
    println(str6.subSequence(0, 5))
    println(str.contains("Namaste"))
    println(str.contains("Namaste "))
    println(str.contains("Namaster"))
    println(str.contains("namaste", ignoreCase = true))
}