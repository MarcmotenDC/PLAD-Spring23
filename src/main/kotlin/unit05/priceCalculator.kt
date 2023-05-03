package unit05

fun calculateRetail (wholesale: Double, markup: Double): Double {
    val per: Double = markup / 100 + 1
    return wholesale * per
}

fun main() {
    var cont = false
    while (!cont) {
        print("Enter the wholesale price: ")
        val wholesale = readln().toDoubleOrNull()
        print("Enter the markup percentage (without % symbol): ")
        val markup = readln().toDoubleOrNull()
        if (wholesale != null || markup != null) {
            val retailPrice = String.format("%.2f", calculateRetail(wholesale!!, markup!!))
            println("The retail price of the item is: $$retailPrice")
            cont = true
        } else {
            println("Enter valid information")
        }
    }

}