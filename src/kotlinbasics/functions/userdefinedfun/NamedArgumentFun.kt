package kotlinbasics.functions.userdefinedfun


fun main() {

    myValue()
    myValue('X', 2)
    myValue('Y')
    myValue(myChar = 'Z', 3)
    myValue(myChar = 'A', num = 4)
    myValue('B', num = 5)
    myValue(myChar = 'C', num = 6)
    //the next two cases cannot be achieved in default argument fun
    myValue( num = 7)
    myValue(num = 8, myChar = 'D')
}

fun myValue(myChar:Char = 'M', num:Int = 10){

    for (i in 1..num){
        println("My value is $myChar : $i")
    }
}