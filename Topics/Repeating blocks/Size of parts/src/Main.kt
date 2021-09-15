fun main() {
    val results = IntArray(3)
    repeat(readLine()!!.toInt()) {
        when (readLine()!!.toInt()) {
            0 -> results[0]++
            1 -> results[1]++
            -1 -> results[2]++
        }
    }
    println(results.joinToString(separator = " "))
}