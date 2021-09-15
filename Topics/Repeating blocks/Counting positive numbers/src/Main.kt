fun main() {
    val n = readLine()!!.toInt()
    var nPos = 0
    repeat(n) {
        if (readLine()!!.toInt() > 0) nPos++
    }
    println(nPos)
}