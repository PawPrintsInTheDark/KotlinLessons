fun main() {
    // 1.
    val map = mapOf(1 to "Дима", 2 to "Лёша", 3 to "Анна", 4 to "Юра", 5 to "Андрей", 6 to "Гена")
    println(map.filter { it.key < 5 })
    line()
    // 2.
    println(map.filter { it.value.endsWith("а") })
    line()
    // 3.
    println(map.filter { it.value.startsWith("Г") })
    line()
    // 4.
    val prizeMap = mapOf(
        15 to 25,
        20 to 15,
        25 to 30,
        35 to 10,
        40 to 22,
        55 to 18
    )
    println(prizeMap.filter { it.value > 20 && it.key % 10 == 5})
}

fun line() {
    repeat(40) {
        print("=")
    }
    println()
}