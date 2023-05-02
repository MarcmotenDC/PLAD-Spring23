package unit04
fun main() {
    val rNum = (Math.random() * (100 - 1 + 1)).toInt() + 1
    var correct = false
    var count = 0
    println("A random number has been created from 1 to 100.")
    while (!correct) {
        print("Guess the Number: ")
        val guess = readln().toIntOrNull()
        //checks for valid input
        if (guess != null) {
            //checks for too high, low, or correct guess
            if (guess == rNum) {
                count++
                println("---------------------------")
                println("That is correct!!")
                println("Number of guesses: $count")
                println("---------------------------")
                correct = true
            } else if (guess < rNum) {
                println("Too low, try again")
                count++
            } else if (guess > rNum) {
                println("Too high, try again")
                count++
            } else {
                println("Try Again")
                count++
            }
        } else {
            println("Enter a number")
        }
    }
}