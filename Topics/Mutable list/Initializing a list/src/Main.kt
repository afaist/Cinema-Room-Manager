fun main() {
    val numbers = MutableList<Int>(100) { 0 }.also { it[0] = 1; it[9] = 10; it[99] = 100 }

    // do not touch the lines below 
    println(numbers.joinToString())
}