package unit03
fun main() {
    print("Enter runner 1: ")
    val runner1 = readln()
    print("Enter runner 1's time (in minutes): ")
    val runner1Time = readln().toIntOrNull()
    print("Enter runner 2: ")
    val runner2 = readln()
    print("Enter runner 2's time (in minutes): ")
    val runner2Time = readln().toIntOrNull()
    print("Enter runner 3: ")
    val runner3 = readln()
    print("Enter runner 3's time (in minutes): ")
    val runner3Time = readln().toIntOrNull()

    if (runner1.isBlank() || runner2.isBlank() || runner3.isBlank() || runner1Time == null || runner2Time == null || runner3Time == null) {
        print("Enter valid runner names and times")
    } else {
        val runnerList = listOf(
            runner1 to runner1Time,
            runner2 to runner2Time,
            runner3 to runner3Time


        )
        val sortedRunList = runnerList.sortedBy{it.second}
        for (runner in sortedRunList) {
            println(runner.first +" " + runner.second + "min" )
        }
    }
}