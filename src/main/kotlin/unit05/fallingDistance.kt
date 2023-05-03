package unit05

fun fallingDistance(time: Int): Double {
    return ((time * time) * 9.8) / 2
}
fun main() {
    var i = 1
    while (i <= 10) {
        val distance =String.format("%.1f", fallingDistance(i))
        println("Distance: ${distance}m")
        i++
    }
}