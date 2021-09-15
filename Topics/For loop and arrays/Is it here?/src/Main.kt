fun main() {
    val nArray = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(if (readLine()!!.toInt() in nArray) "YES" else "NO")
}