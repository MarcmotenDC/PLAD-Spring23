import kotlin.math.*
fun main() {
    print("Enter the principal: ")
    val principal = readln().toDoubleOrNull()
    print("enter the annual interest rate: ")
    val rate = readln().toDoubleOrNull()
    print("Enter how many times per year interest is compounded: ")
    val ncompound = readln().toDoubleOrNull()
    print("Enter number of years the account will earn interest: ")
    val time = readln().toDoubleOrNull()
    // checks if values can be used
    if (principal === null || rate === null || ncompound === null || time === null) {
        println("enter valid numbers")
    } else {
        //Compound Interest formula
        val calc: Double = 1 + (rate / ncompound)
        val exp = ncompound * time
        val total: Double = (principal * Math.pow(calc , exp))
        val formattedTotal = String.format("%.2f", total)
        println("Total Amount: $$formattedTotal")
    }
}