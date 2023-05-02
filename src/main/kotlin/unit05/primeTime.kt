package unit05

fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0
}
fun isPrime(number: Int): Boolean {
    var prime = true
   var maxNum = number - 1
    for (i in 2..maxNum) {
      if (isNumberDivisible(number, i)) {
          prime = false
      }
    }
    return prime
}

fun main() {
    print(isPrime(8893))
}