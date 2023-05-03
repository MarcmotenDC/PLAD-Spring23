package unit05
fun celsius(temp: Int): Double {
    return (5.0/9.0) * (temp - 32)
}
fun main() {
    var i = 0
    while (i <= 20) {
        print("$i°F ")
        println("${celsius(i).toInt()}°C")
        i++
    }
}