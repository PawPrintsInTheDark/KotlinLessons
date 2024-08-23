fun main() {
    // 1.
    print("").line()
    val list = listOf("one", "two", "three").map { it.reversed() }
    println(list).line()
    // 2.
    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).filter { it <= 3 }.map { it * it }
    println(numList).line()
    // 3.
    val colorListEn = listOf("red", "blue", "white")
    val colorListRu = listOf("красный", "синий", "белый")
    println(colorListEn.zip(colorListRu) { a, b -> "Значение: $a, перевод: $b" }).line()
    // 4.
    val monthList = listOf("Jan", "Feb", "Mar", "Apr", "May").sumOf { it.length }
    println(monthList).line()
}

fun Any.line() {
    repeat(50) { print(ColorUtils.ANSI_CYAN + "=" + ColorUtils.ANSI_RESET) }
    println()
}