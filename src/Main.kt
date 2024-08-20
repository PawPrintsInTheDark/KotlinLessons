fun main() {
    // 1.
    val words = listOf("банан", "яблоко", "апельсин", "груша", "киви", "брусника", "гранат")
    words.groupBy { it.first() }
        .forEach { println("Первый символ ${it.key}: ${it.value}") }
    line()
    // 2.
    words.groupBy { it.length }
        .forEach { println("Длина строки ${it.key}: ${it.value}") }
    line()
    // 3.
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    phoneToYear.groupBy { it.second }
        .forEach { println("Год ${it.key}: ${it.value.map { it.first }}") }
}

fun line() {
    repeat(40) {
        print("=")
    }
    println()
}