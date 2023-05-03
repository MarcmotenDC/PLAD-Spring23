package unit05
fun compChoice(): String {
    val comp = when((Math.random() * (3 - 1 + 1)).toInt() + 1) {
        1 -> "Rock"
        2 -> "Paper"
        3 -> "Scissors"
        else -> "Rock"
    }
    return comp
}
fun userInput(): String {
    var input: Int
    do {
        println("Rock Paper Scissors")
        println("--------------------")
        println("1. Rock")
        println("2. Paper")
        println("3. Scissors")
        println("--------------------")
        print("Enter the number of your choice: ")
        input = readln().toIntOrNull() ?:0
    } while (input !in 1..3)

    val userChoice = when(input) {
        1 -> "Rock"
        2 -> "Paper"
        3 -> "Scissors"
        else -> "Rock"
    }
    return userChoice
}

fun main() {
    val compChoice = compChoice()
    val userChoice = userInput()
    println("--------------------")
    println("The computer chose $compChoice")
    if (userChoice == compChoice) {
        println("Its a tie!")
        println("--------------------")
    } else if ((userChoice == "Rock" && compChoice == "Scissors") || (userChoice == "Paper" && compChoice == "Rock") || (userChoice == "Scissors" && compChoice == "Paper")) {
        println("You win!")
        println("--------------------")
    } else {
        println("You lose!")
        println("--------------------")
    }

}