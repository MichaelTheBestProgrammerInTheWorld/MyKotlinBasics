package kotlinbasics

fun main() {

    val bankAccountNumber = 12345
    var accountBalance = 800000

    println("Bank account number = $bankAccountNumber")
    println("Bank account balance = $accountBalance")

    accountBalance += 75000

    println("Balance after deposit = $accountBalance")
}