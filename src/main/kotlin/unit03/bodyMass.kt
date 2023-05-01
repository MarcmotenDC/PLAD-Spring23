package  unit03
import kotlin.math.round
fun main() {
    print("Enter your weight in lbs: ")
    val weight = readln().toIntOrNull()
    print("Enter your height in inches: ")
    val height = readln().toIntOrNull()
    if(weight == null || height == null) {
        println("Enter a valid weight or height")
    } else {
        val bmicalc = weight * 703 / (height * height).toDouble()
        val bmi = round(bmicalc * 10) / 10
        if (bmi < 18.5) {
            println("You are underweight (BMI = $bmi) BMI should be over 18.5")
        } else if (bmi > 25) {
            println("You are overweight (BMI = $bmi) BMI should be under 25")
        } else {
            println("You are at a healthy weight! Keep it up! (BMI = $bmi)")
        }
    }
}