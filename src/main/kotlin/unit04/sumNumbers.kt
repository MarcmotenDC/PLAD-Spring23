package unit04

fun main() {
    var i = 0
    var sum = 0
    print("Enter a number greater than 0: ")
    val input = readln().toIntOrNull()
    if(input == null) {
        println("Please enter a whole number")
    } else if (input < 1) {
        println("Please enter a number greater than 0")
    } else {
        while(i <= input) {
            sum += i
            println(sum)
            i++
        }
    }
}