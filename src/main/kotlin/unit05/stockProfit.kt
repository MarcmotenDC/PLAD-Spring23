package unit05
fun profitCalc(ns: Int, pp: Double, pc: Double, sp: Double, sc: Double): Double {
    return ((ns * sp) - sc) - ((ns * pp) + pc)
}

fun main() {
    var cont = false
    while (!cont) {
        print("Enter the number of shares: ")
        val ns = readln().toIntOrNull()
        print("Enter the price per share: ")
        val pp = readln().toDoubleOrNull()
        print("Enter the purchase commission paid: ")
        val pc = readln().toDoubleOrNull()
        print("Enter the sale price per share: ")
        val sp = readln().toDoubleOrNull()
        print("Enter the sale commission paid: ")
        val sc = readln().toDoubleOrNull()
        if(listOf(ns, pp, pc, sp, sc).all { it != null }) {
            val profit = String.format("%.2f", profitCalc(ns!!, pp!!, pc!!, sp!!, sc!!))
            val  pl = if (profit.toFloat() < 0) {
                "Loss"
            } else {
                "Profit"
            }
            println("--------------------------")
            println("Expected $pl: $$profit")
            println("--------------------------")
            cont = true
        } else {
            println("Please enter valid info")
            println("---------------------------")
        }
    }
}