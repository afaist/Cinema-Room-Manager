fun main() = println(DoubleArray(2) { readLine()!!.toDouble() }.run { this[0] / this[1] })