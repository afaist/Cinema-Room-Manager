package cinema

fun main() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seats = readLine()!!.toInt()
    // Fill cinema hall
    val cinemaHall = Array(rows) { Array(seats) { "S" to 10 } }

    if (60 < rows * seats) {
        for (row in rows / 2 + 1..rows) {
            for (seat in 1..seats) {
                cinemaHall[row - 1][seat - 1] = cinemaHall[row - 1][seat - 1].copy(second = 8)
            }
        }
    }
    // Menu
    var exit = false
    while (!exit) {
        when (showMenu()) {
            1 -> showSeats(cinemaHall)
            2 -> buyTicket(cinemaHall)
            3 -> showStatistics(cinemaHall)
            0 -> exit = true
        }
    }
}

/**
 * Display current state of the seating arrangement
 */
fun showSeats(cinemaHall: Array<Array<Pair<String, Int>>>) {
    println("\nCinema:")
    println("  ${(1..cinemaHall[0].size).joinToString(" ")}")
    for (i in 1..cinemaHall.size)
        println("$i ${cinemaHall[i - 1].mapIndexed { _, it -> it.first }.joinToString(" ")}")
}

/**
 * Show menu
 */
fun showMenu(): Int {

    println(
        "\n1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit"
    )
    return readLine()!!.toInt()
}

/**
 * Buy ticket ask
 */
fun buyTicket(cinemaHall: Array<Array<Pair<String, Int>>>) {
    val (row, seat) = requestPlace(cinemaHall)
    cinemaHall[row - 1][seat - 1] = cinemaHall[row - 1][seat - 1].copy(first = "B")
    println("\nTicket price: \$${cinemaHall[row - 1][seat - 1].second}")
}

/**
 *
 */
fun requestPlace(cinemaHall: Array<Array<Pair<String, Int>>>): IntArray {
    val maxRow = cinemaHall.size
    val maxCol = cinemaHall[0].size
    val position = IntArray(2)
    while (true) {
        println("\nEnter a row number:")
        position[0] = readLine()!!.toInt()
        println("Enter a seat number in that row:")
        position[1] = readLine()!!.toInt()

        if (position[0] in 1..maxRow && (position[1] in 1..maxCol)) {
            if (cinemaHall[position[0] - 1][position[1] - 1].first == "S")
                return position
            else
                println("\nThat ticket has already been purchased!")
        } else
            println("\nWrong input!")
    }
}

/**
 *
 */
fun showStatistics(cinemaHall: Array<Array<Pair<String, Int>>>) {
    var currentIncome = 0
    var totalIncome = 0
    var purchasedTickets = 0
    val totalSeats = (cinemaHall.size * cinemaHall[0].size).toDouble()
    for (i in cinemaHall.indices) {
        for (j in cinemaHall[0].indices) {
            totalIncome += cinemaHall[i][j].second
            if (cinemaHall[i][j].first == "B") {
                currentIncome += cinemaHall[i][j].second
                purchasedTickets++
            }
        }
    }
    println("\nNumber of purchased tickets: $purchasedTickets")
    println("Percentage: %.2f%%".format(purchasedTickets / totalSeats * 100))
    println("Current income: $$currentIncome")
    println("Total income: $$totalIncome")
}