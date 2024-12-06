import kotlinx.coroutines.*

fun main() = runBlocking {

    val coffee = selectedMenu()
    selectMenu(coffee)

}

sealed class Coffee(val sugar: Int, val volume: Double) {
    class Americano(sugar: Int, volume: Double) : Coffee(sugar, volume)
    class Cappuccino(sugar: Int, volume: Double, val milk: Double) : Coffee(sugar, volume)
    class Latte(sugar: Int, volume: Double) : Coffee(sugar, volume)

}

suspend fun selectMenu(menu: Coffee) {
    for (i in 1..10) {
        delay(500L)
        print("${i * 10}% ")
    }
    println()

    when (menu) {
        is Coffee.Americano -> println("Ваш кофе готов: Americano, сахар: ${menu.sugar}, объем: ${menu.volume} ")
        is Coffee.Cappuccino -> println("Ваш кофе готов: Cappuccino, сахар: ${menu.sugar}, объем: ${menu.volume} , молоко: ${menu.milk} ")
        is Coffee.Latte -> println("Ваш кофе готов: Latte, сахар: ${menu.sugar}, объем: ${menu.volume} ")
    }
}


fun selectedMenu(): Coffee {
    println("Выберите кофе: 1. Americano 2. Cappuccino 3. Latte")
    val coffeeChoice = readLine()?.toIntOrNull()

    println("Количество сахара:")
    val sugar = readLine()?.toIntOrNull() ?: 0

    println("Объем кофе (в литрах):")
    val volume = readLine()?.toDoubleOrNull() ?: 0.0

    return when (coffeeChoice) {
        1 -> Coffee.Americano(sugar, volume)
        2 -> {
            println("Количество молока:")
            val milk = readLine()?.toDoubleOrNull() ?: 0.0
            Coffee.Cappuccino(sugar, volume, milk)
        }

        3 -> Coffee.Latte(sugar, volume)
        else -> throw IllegalArgumentException("Неверный выбор кофе")
    }

}
//
//val totalSteps = 10
//val barLength = 20 // Длина шкалы прогресса
//
//for (i in 0..totalSteps) {
//    // Формирование строки прогресса
//    val filledBlocks = i * barLength / totalSteps
//    val emptyBlocks = barLength - filledBlocks
//    val progressBar = "█".repeat(filledBlocks) + "░".repeat(emptyBlocks)
//
//    // Вывод прогресса
//    print("\r[$progressBar] $i% готово") // Используем \r для возврата в начало строки
//    delay(500L) // Имитация времени выполнения
//}