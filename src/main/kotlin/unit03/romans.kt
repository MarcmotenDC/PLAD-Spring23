fun main() {
    print("Enter a number from 1 to 10: ")
    var number = readln().toIntOrNull()
    if (number == null) {
        println("That is not a number")
    } else if(number in 1..10){
        if (number == 1) {
            println("I")
        } else if (number == 2) {
            println("II")
        }else if (number == 3) {
            println("III")
        }else if (number == 4) {
            println("IV")
        }else if (number == 5) {
            println("V")
        }else if (number == 6) {
            println("VI")
        }else if (number == 7) {
            println("VII")
        }else if (number == 8) {
            println("VIII")
        }else if (number == 9) {
            println("IX")
        }else if (number == 10) {
            println("X")
        }
    } else {
        println("Only Enter a number from 1 to 10")
    }


}