package unit06

var currentRoom = Pair(0, 0)

fun userDirection(): Pair<Int, Int> {
    var ew = 0
    var ns = 0
    print("What direction? ")
    var input = readln().firstOrNull()
    while (input == null || (input != 'n' && input != 's' && input != 'e' && input != 'w' && input != 'N' && input != 'S' && input != 'E' && input != 'W')) {
        println("you cannot go that way")
        print("What direction? ")
        input = readln().firstOrNull()
    }
    when (input) {
        'n', 'N' -> if (currentRoom.second < 2) ns += 1
        's', 'S' -> if (currentRoom.second > -2) ns -= 1
        'e', 'E' -> if (currentRoom.first < 2) ew += 1
        'w', 'W' -> if (currentRoom.first > -2) ew -= 1
    }
    val newRoom = Pair(currentRoom.first + ew, currentRoom.second + ns)
    return if (newRoom == currentRoom) Pair(0, 0) else Pair(ew, ns)
}

fun combinePairs(pair1: Pair<Int, Int>, pair2: Pair<Int, Int>): Pair<Int, Int> {
    return Pair(pair1.first + pair2.first, pair1.second + pair2.second)
}

fun gamePlay() {


    while (true) {
        val output = when (combinePairs(currentRoom, userDirection())) {
            Pair(0, 1) -> {
                println("You are in the North Hall.")
                println("The marble floors are polished to a shine, reflecting the chandelier above.")
                Pair(0, 1)
            }
            Pair(0, -1) -> {
                println("It seems the door is stuck.")
                println("Looks like you can't leave right now. Better look around.")
                Pair(0, 0)
            }
            Pair(1, 0) -> {
                println("You find yourself in a grand dining room.")
                println("A long table stretches down the center of the room, surrounded by ornate chairs.")
                Pair(1, 0)
            }
            Pair(-1, 0) -> {
                println("You have encountered a locked door.")
                println("It looks sturdy and well-made, with a keyhole just out of reach.")
                Pair(0, 0)
            }
            Pair(1, 1) -> {
                println("You are in a cozy kitchen.")
                println("The aroma of fresh bread wafts through the air, making your stomach growl.")
                Pair(1, 1)
            }
            Pair(-1, 1) -> {
                println("You are in a spacious bedroom.")
                println("A four-poster bed dominates the center of the room, surrounded by plush carpets.")
                Pair(-1, 1)
            }
            Pair(0, 2) -> {
                println("You are standing on a balcony.")
                println("A gentle breeze rustles the leaves of nearby trees, and you can see for miles.")
                Pair(0, 2)
            }
            Pair(0, 0) -> {
                println("You are at the entrance.")
                println("The paintings on the stone walls look faded")
                Pair(0, 0)
            }
            else -> {
                println("You get lost and somehow end up back where you started!")
                println("You are at the entrance.")
                println("The paintings on the stone walls look faded")
                Pair(0, 0)
            }
        }
        currentRoom = combinePairs(currentRoom, output)
        println("Current room: $currentRoom")
    }
}

fun main() {
    println("Mansion Exploration")
    println("-------------------")
    print("play? (y,n): ")
    val play = readln().firstOrNull()
    if (play != null) {
        if (play == 'y' || play == 'Y') {
            gamePlay()
        } else {
            println("See you next time!")
        }
    } else {
        println("See you next time!")
    }
}

