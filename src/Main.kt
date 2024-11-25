import java.io.File

fun main() {
    line()
    // 1.
    val filename = "example.txt"
    writeToFile(filename, "Hello World!")

    println(readFromFile("text.txt"))
    println(readFromFile(filename))
    line()
    // 2.
    val filePath = File("").absoluteFile.toString()
    val fileName = "even_numbers.txt"
    val N = 5

    writeEvenNumbersToFile(filePath, fileName, N)
    println(readFromFile(fileName))
    line()
    // 3.

    try {
        val numbers = File(fileName).readLines().map { it.toInt() }

        if (numbers.size < 4) {
            println("Файл должен содержать не менее четырех элементов!")
            return
        }

        println("Первый элемент: ${numbers[0]}")
        println("Второй элемент: ${numbers[1]}")
        println("Предпоследний элемент: ${numbers[numbers.size - 2]}")
        println("Последний элемент: ${numbers.last()}")

    } catch (e: Exception) {
        println("Произошла ошибка при чтении файла: ${e.message}")
    }

}

fun writeEvenNumbersToFile(filePath: String, fileName: String, N: Int) {
    val file = File("$filePath/$fileName")
    val evenNumbers = (1..N).map { it * 2 }
    file.writeText(evenNumbers.joinToString("\n"))
    println("Файл \"$fileName\" успешно создан.")
}

fun line() {
    repeat(70) {
        print(ColorUtils.ANSI_CYAN + "=" + ColorUtils.ANSI_RESET)
    }
    println()
}

fun writeToFile(filename: String, text: String) {
    val file = File(filename)
    file.writeText(text)
    println("Teкст записан в файл: $filename")
}

fun readFromFile(filename: String): String {
    val file = File(filename)
    return if (file.exists()) {
        file.readText()
    } else {
        "Файл \"$filename\" не найден."
    }
}