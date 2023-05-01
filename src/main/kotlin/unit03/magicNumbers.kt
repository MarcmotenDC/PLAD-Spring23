package unit03
fun main() {
    print("Enter a month in numeric form (ex: 05): ")
    val month = readln().toIntOrNull()
    print("Enter a numeric day: ")
    val day = readln().toIntOrNull()
    print("Enter a two digit year (ex: 02, 23): ")
    val year = readln().toIntOrNull()
    if(month == null || day == null || year == null || month > 12 || day > 31 || year > 99) {
        println("Enter valid numbers")
    } else if (month * day == year){
        println("The date is MAAAAAAGIC")
    } else {
        println("The date is not magic :(")
    }
}