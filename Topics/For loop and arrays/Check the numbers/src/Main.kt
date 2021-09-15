fun main() {
    val sNumbers = Array(readLine()!!.toInt()) { readLine()!! }.joinToString("")
    val (p, m) = readLine()!!.split(" ")
    println(if ("$p$m" in sNumbers || "$m$p" in sNumbers) "NO" else "YES")
}