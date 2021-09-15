fun main() {
    val longs = MutableList(3) { i -> 100_000_000_001 + i }

    // do not touch the lines below 
    println(longs.joinToString())
}