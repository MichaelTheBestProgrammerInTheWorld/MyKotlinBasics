package kotlinbasics.functions.userdefinedfun

fun main() {

    val myHighFun:(String, String) -> String = {
        s1, s2 -> "$s1 : $s2"
    }
    myHighOrderFun("Namaste", "Coder", myHighFun)
}

fun myHighOrderFun(s1:String, s2:String, highFun:(String, String) -> String):Unit{

    val myStr = highFun(s1, s2)
    println("My String is $myStr")
}