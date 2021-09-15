fun main() {
    val nArray = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    println(nArray.count { e -> e == m })
}