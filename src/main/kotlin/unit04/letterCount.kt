package unit04
fun main() {
    print("Enter a string: ")
    val str = readln()
    print("Enter a character: ")
    val charStr = readln().firstOrNull()
    if (str.isBlank() || charStr == null) {
        println("Enter a valid string/character")
    } else {
       var count = 0
        for (char in str) {
            if (char == charStr) {
                count++
            }
        }
        println("$count occurances of the character '$charStr' in '$str'")
    }
}