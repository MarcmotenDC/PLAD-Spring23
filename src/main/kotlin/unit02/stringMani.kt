// Marc Moten String Manipulator 4/27/23
fun main() {
    print("Enter your favorite city: ")
    val cityInput: String = readln()
    if (cityInput.isNotEmpty()) {
        println(cityInput.length)
        println(cityInput.uppercase())
        println(cityInput.lowercase())
        println(cityInput[0])
    } else {
        println("no city given")
    }


}
