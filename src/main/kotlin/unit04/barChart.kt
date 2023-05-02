package unit04
fun main () {
    print("Enter today's sales for store 1: $")
    val store1 = readln().toIntOrNull()
    print("Enter today's sales for store 2: $")
    val store2 = readln().toIntOrNull()
    print("Enter today's sales for store 3: $")
    val store3 = readln().toIntOrNull()
    print("Enter today's sales for store 4: $")
    val store4 = readln().toIntOrNull()
    print("Enter today's sales for store 5: $")
    val store5 = readln().toIntOrNull()
    val storeList = listOf(store1, store2, store3, store4, store5)
    if (storeList.all {it == null}) {
        println("Please enter valid numbers")
    } else  {
        var count = 1
        //can't loop over original list
        val divStoreList = storeList.map { it?.div(100) }
        println("Graph of Sales")
        println("----------------------------------------")
        for (i in divStoreList.indices) {
            val bar = divStoreList[i]?.let { "*".repeat(it) }
            println("Store $count: $bar")
            count++
        }
        println("----------------------------------------")
    }
}