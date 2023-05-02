package unit04
import kotlin.math.round
fun main() {
    print("Enter starting population (2 or more): ")
    val sPop = readln().toDoubleOrNull()
    print("Enter the average daily population increase percentage (no % symbol): ")
    val popInc = readln().toDoubleOrNull()
    print("Enter how many days the organisms will multiply: ")
    val days = readln().toIntOrNull()
    if (sPop == null || sPop < 2 || popInc == null || popInc < 0 || days == null || days < 1) {
        println("Please enter valid information")
    } else {
       val popPer = 1 + (popInc / 100)
        var dayCount = 1
        var pop: Double = sPop
        while (dayCount <= days) {
            pop *= popPer
            var curPop = round(pop).toInt()
            println("Day $dayCount: Population: $curPop")
            dayCount++
        }
        var fPop = round(pop).toInt()
        println("Final Population after $dayCount days: $fPop")
    }
}