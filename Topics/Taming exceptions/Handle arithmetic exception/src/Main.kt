fun main() {
    val (a, b) = IntArray(2) { readLine()!!.toInt() }
    println(if (b == 0) "Division by zero, please fix the second argument!" else a / b)
}