fun main() {
    // 1.
    print("").line()
    val list = (1..20).toList()
    println(list.dropWhile { it <= 5 }.count { it % 2 == 0 }).line()
    // 2.
    println(list.takeWhile { it < 8 }.sum()).line()
    // 3.
    val numList = listOf("one", "two", "three")
    println(numList.flatMap { it.toList() }).line()
    // 4.
    val strings = listOf("один", "два", "три", "четыре", "пять", "пятнадцать")
    println(strings.maxBy { it.length }).line()
    // 5.
    val products = listOf(
        Product("Яблоки", 10),
        Product("Бананы", 5),
        Product("Апельсины", 8),
        Product("Груши", 12)
    )
    println("Кол-во продуктов на складе: " + products.sumOf { it.count })

}

data class Product(val name: String, val count: Int)


fun Any.line() {
    repeat(60) { print(ColorUtils.ANSI_CYAN + "=" + ColorUtils.ANSI_RESET) }
    println()
}