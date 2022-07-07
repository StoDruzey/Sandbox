fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

fun <T> T.easyPrint(): T {
    println(this)
    return this
}

fun main(args: Array<String>) {
    println("Madrigal has left the building".addEnthusiasm(5))
    "Madrigal has left the building".easyPrint().addEnthusiasm(5).easyPrint()
    42.easyPrint()
}