fun main() = Array(readLine()!!.toInt()) { readLine()!!.toInt() }.run {
    println((0 until this.size - 2).count { i -> this[i] + 1 == this[i + 1] && this[i] + 2 == this[i + 2] })
}