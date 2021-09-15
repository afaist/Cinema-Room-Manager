fun main() {
    // put your code here
    val (a, b, c) = CharArray(3) { readLine()!!.first() }
    println(b == a + 1 && c == b + 1)
}