package unit03
fun main() {
    var vegetarian = false
    var vegan = false
    var glutenFree = false
    var vegetarianOp: Int
    var veganOp: Int
    var glutenOp: Int

    val restaurantList = mutableListOf(
        "Joe's Gourmet Burgers", //None
        "Main Street Pizza Company", //Vegetarian, Gluten-Free
        "Corner Café", //All
        "Mama's Fine Italian", //Vegetarian
        "The Chef's Kitchen", //All
    )
    // vegetarian Loop
    do {
        println("Is Anyone in your party vegetarian?")
        println("1. yes")
        println("2. no")
        print("Enter number: ")
        vegetarianOp = readln().toIntOrNull() ?: 0
    } while (vegetarianOp !in 1..2)

    //Vegan Loop
    do {
        println("Is Anyone in your party vegan?")
        println("1. yes")
        println("2. no")
        print("Enter number: ")
        veganOp = readln().toIntOrNull() ?: 0
    } while (veganOp !in 1..2)

    //Gluten Loop
    do {
        println("Is Anyone in your party gluten-free?")
        println("1. yes")
        println("2. no")
        print("Enter number: ")
        glutenOp = readln().toIntOrNull() ?: 0
    } while (glutenOp !in 1..2)

    when (vegetarianOp) {
        1 -> vegetarian = true
        2 -> vegetarian = false
    }

    when (veganOp) {
        1 -> vegan = true
        2 -> vegan = false
    }
    when (glutenOp) {
        1 -> glutenFree = true
        2 -> glutenFree = false
    }

    //checks for values and removes options
    if(glutenFree) {
        restaurantList.remove("Joe's Gourmet Burgers")
        restaurantList.remove("Mama's Fine Italian")
    }
    if(vegetarian) {
        restaurantList.remove("Joe's Gourmet Burgers")
    }
    if(vegan) {
        restaurantList.remove("Joe's Gourmet Burgers")
        restaurantList.remove("Main Street Pizza Company")
        restaurantList.remove("Mama's Fine Italian")

    }
    println("Here are your restaurant choices: ")
    for(restaurant in restaurantList) {
        println(restaurant)
    }
}