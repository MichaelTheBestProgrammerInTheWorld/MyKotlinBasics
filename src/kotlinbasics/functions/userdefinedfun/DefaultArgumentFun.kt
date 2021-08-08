package kotlinbasics.functions.userdefinedfun

fun main() {

    printVal()
    printVal('N', 30)
    printVal('X')
    //printVal(, 50) note that we cannot pass the second argument only here, look at named argument function
}

fun printVal(myChar:Char = 'M', num:Int = 20){

    println("My value is $myChar : $num")
}