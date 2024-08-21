fun main() {
    // 1.
    val i = 5
    println(i.pow())
    // 2.
    val str = "Hello"
    println(str.concat(" World"))
    // 3.
    println(str.lastIndex())
    // 4.
    println((-1).sqrt())

}

fun Int.pow() = this * this
fun String.concat(s: String) = this + s
fun String.lastIndex() = this.lastIndex
fun Int.sqrt(): Int? {
    if (this < 0) {
        println("Ошибка: нельзя вычислить квадратный корень из отрицательного числа.")
        return null
    }
    return kotlin.math.sqrt(this.toDouble()).toInt()
}