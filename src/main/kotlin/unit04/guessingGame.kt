package unit04
fun main() {
    val rNum = (Math.random() * (100 - 1 + 1)).toInt() + 1
    var correct = false
    println("A random number has been created from 1 to 100.")
    while (!correct) {
        print("Guess the Number: ")
        val guess = readln().toIntOrNull()
        //checks for valid input
        if (guess != null) {
            //checks for too high, low, or correct guess
            if (guess == rNum) {
                println("That is correct!!")
                correct = true
            } else if (guess < rNum) {
                println("Too low, try again")
            } else if (guess > rNum) {
                println("Too high, try again")
            } else {
                println("Try Again")
            }
        } else {
            println("Enter a number")
        }
    }

}