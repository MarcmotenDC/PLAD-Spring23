fun main(args: Array<String>) {
    print("Enter number of cookies eaten: ")
    val cookiesEaten = readLine()!!.toInt()
    println(cookiesEaten)
    var calPS: Int = 300
    var totalServings: Int = 10
    var calorieIntake: Int = (calPS * totalServings) / cookiesEaten
    println("Your calorie intake was: $calorieIntake calories")
}