fun main() {
    // 1.
    while (true) {
        println("Введите месяц года")
        val m = readln().toIntOrNull()
        if (m != null && m in 1..12) {
            println("Время года: ${getSeason(m)?.desciption} ")
            println()
        } else println("Такого месяца не существует.")
        println("Желаете продолжить или закончить программу?")
        println("1. Продолжить\n2. Закончить программу")
        if (readln().toIntOrNull() == 2) break
    }
    // 2.
    val str = "Шумоизоляция"

    val charCount = mutableMapOf<Char,Int>()
    for (char in str){
        charCount[char] = charCount.getOrDefault(char, 0)+1
    }
    println("Повторяющиеся символы:")
    println(charCount)
}


enum class Season(val desciption: String) {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    FALL("Осень")
}

fun getSeason(month: Int): Season? {
    return when (month) {
        12, 1, 2 -> Season.WINTER
        3, 4, 5 -> Season.SPRING
        6, 7, 8 -> Season.SUMMER
        9, 10, 11 -> Season.FALL
        else -> null
    }
}