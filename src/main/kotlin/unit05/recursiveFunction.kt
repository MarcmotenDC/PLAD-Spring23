package unit05

fun fibonacci(number: Int): Int {
   return if (number < 0) {
       0
    } else if (number <= 2) {
       1
   } else {
        fibonacci(number - 1) + fibonacci(number - 2)
    }
}

fun main () {
    print(fibonacci(10))
}