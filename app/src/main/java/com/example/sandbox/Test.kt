fun main() {
    test()
}

fun test() {
    val value1 = readLine()?.toInt() ?: return
    val value2 = readLine()?.toInt() ?: return
    when (value1 * value2) {
        in 0..100 -> println("in range 0..100")
        else -> println("out of range")
    }
}