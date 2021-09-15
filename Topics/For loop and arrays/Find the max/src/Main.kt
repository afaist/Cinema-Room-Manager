fun main() {
    var max = 0
    var maxI = 0
    val nSize = readLine()!!.toInt()
    for (i in 0 until nSize) {
        val n = readLine()!!.toInt()
        if (n > max) {
            max = n
            maxI = i
        }
    }
    println(maxI)
}