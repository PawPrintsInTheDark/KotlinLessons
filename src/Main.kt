fun main() {
    // 1.
    print("").line()
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    println(list.drop(3).take(7).sum()).line()
    // 2.
    val numbers = listOf(1, 2, 3, 4)
    println(numbers.fold("") { sum, el -> sum + el }).line()
    // 3.
    val players = listOf(
        Player("Алексей", 150, 2000),
        Player("Мария", 200, 3000),
        Player("Сергей", 250, 1500),
        Player("Екатерина", 100, 4000)
    )
    println("Общее кол-во очков: " + players.sumOf { it.points })
    println("Общее кол-во денег: " + players.sumOf { it.money }).line()
    // 4.  Долго думал над решением часто получался такой вывод {я=[Яблоко, яблоко], в=[Виноград]}

        //TODO этот вариант подсмотрел
    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")
    println(fruits.groupBy { it.first().lowercase() }.mapValues { it.value.filter { it.length % 2 == 0 } })

        //TODO этот сделал ChatGPT но пришлось немного подправить его
    val groupedFruits = fruits.fold(mutableMapOf<Char, MutableList<String>>()) { acc, fruit ->
        val firstChar = fruit.first().lowercaseChar()
        if (fruit.length % 2 == 0) {
            acc.computeIfAbsent(firstChar) { mutableListOf() }.add(fruit)
        } else acc.computeIfAbsent(firstChar) { mutableListOf() } + ""
        acc
    }
    println(groupedFruits.toMutableMap())

    //TODO этот в конце концов сделал сам
    println(fruits.associateBy(
        { it.first().lowercase() },
        { t -> fruits.filter { if (it.length % 2 == 0 && it.lowercase().startsWith(t.lowercase().first())) true else false } }))


}

data class Player(val name: String, val points: Int, val money: Int)


fun Any.line() {
    repeat(50) { print(ColorUtils.ANSI_YELLOW + "=" + ColorUtils.ANSI_RESET) }
    println()
}