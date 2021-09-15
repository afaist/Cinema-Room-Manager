fun main() {
    val iArray = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val (p, m) = readLine()!!.split(" ").map { it.toInt() }
    println(if (p in iArray && m in iArray) "YES" else "NO")
}