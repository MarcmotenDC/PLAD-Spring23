package unit03
fun main() {
    val fees: Double
    
    print("Enter how many checks are written per month: ")
    val checks = readln().toIntOrNull()

    if(checks == null) { // checks for valid input
        println("Please enter a valid number of checks")
    } else { // changes price per check depending on amount written

        fees = if (checks < 20) {
            10 + (0.10 * checks)
        } else if (checks < 40) {
            10 + (0.08 * checks)
        } else if (checks < 60) {
            10 + (0.06 * checks)
        } else {
            10 + (0.04 * checks)
        }

      val total = String.format("%.2f", fees)
        println("Bank service fees per month: $$total")
    }
}