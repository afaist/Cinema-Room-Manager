fun main() {
    val results = IntArray(4)
    repeat(readLine()!!.toInt()) {
        results[readLine()!!.toInt() - 2]++
    }
    println(results.joinToString(separator = " "))
}