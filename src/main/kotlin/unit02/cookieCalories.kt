package unit02
fun main() {
    print("Enter number of cookies eaten: ")
    var cookiesEaten = readln().toIntOrNull()
    if(cookiesEaten != null) {
        val calPCookie = 75
        val calorieIntake: Int = calPCookie * cookiesEaten
        println("Your calorie intake was: $calorieIntake calories")
    } else {
        cookiesEaten = 0
        val calPCookie = 75
        val calorieIntake: Int = calPCookie * cookiesEaten
        println("Your calorie intake was: $calorieIntake calories")
    }

}