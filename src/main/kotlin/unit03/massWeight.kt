package unit03
fun main() {
    print("Enter the object's mass (in kg): ")
    val mass = readln().toDoubleOrNull()

    if(mass == null) {
        println("Enter valid mass")
    } else {
        val weight = mass * 9.8

        if (weight > 1000) {
            println("The object is too heavy")
        } else if(weight < 10) {
            println("The object is too light")
        } else {
            println("The object weighs ${weight}kg")
        }
    }
}