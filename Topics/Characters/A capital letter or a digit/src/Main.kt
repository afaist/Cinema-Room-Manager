fun main() {
    // write your code here
    val c = readLine()!!.first()
    val n = if (c.isDigit()) c.toString().toInt() else 0
    println(c.isUpperCase() || n in 1..9)
}