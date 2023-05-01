package unit03
fun main() {
    print("Enter a name: ").toString()
    val name1 = readln()
    print("Enter a second name: ").toString()
    val name2 = readln()
    print("Enter a third name: ").toString()
    val name3 = readln()
    if(name1.isBlank() || name2.isBlank() || name3.isBlank()) {
        println("Please enter names in all inputs")
    } else {
        val names = listOf(name1, name2, name3)
        val sortedNames = names.sorted()
        for (name in sortedNames) {
            println(name)
        }
    }
}