fun main() {
    val n = readLine()!!.toInt()
    var max4 = 0
    repeat(n) {
        val i = readLine()!!.toInt()
        if (i % 4 == 0 && i > max4) {
            max4 = i
        }
    }
    println(max4)
}