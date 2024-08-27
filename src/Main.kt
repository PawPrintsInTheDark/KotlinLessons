fun main() {
    // 1.
    val employeeList = mutableListOf(
        Employee("Алиса", 30, 50000),
        Employee("Миша", 25, 60000),
        Employee("Дима", 35, 55000),
        Employee("Жора", 28, 70000),
        Employee("Кузя", 22, 48000)
    )
    println().line()
    employeeList.sortedBy { it.name }.forEach { println(it) }.line()
    employeeList.sortedBy { it.age }.forEach { println(it) }.line()
    employeeList.sortedBy { it.salary }.forEach { println(it) }.line()
    // 2.
    val arrayMatrix = Array(3) { Array(4) { (1..12).random() } }
    println("Исходный массив:")
    arrayMatrix.forEach { println(it.joinToString("\t")) }.line()
    println("Отсортированный массив:")
    arrayMatrix.forEach { println(it.sorted().joinToString("\t")) }.line()
    // 3.
    val arrayMatrix2 = Array(3) { IntArray(4) { (1..12).random() } }
    println("Проверка на пилообразность массивов")
    arrayMatrix2.forEach { println(it.joinToString("\t")) }.line()
    val sawArrs = arrayMatrix2.filter { isSawSmooth(it) }
    println("Пилообразные массивы: \n${sawArrs.joinToString("\n") { it.joinToString(", ") }}")
    println("Кол-во пилообразных массивов: ${sawArrs.count()}")
}

fun isSawSmooth(array: IntArray): Boolean {
    return array.size >= 3 && (1..< array.size - 1).all { i ->
        array[i] != array[i - 1] && array[i] != array[i + 1] &&
                (i <= 1 || (array[i] > array[i - 1] && array[i - 1] < array[i - 2]) ||
                        (array[i] < array[i - 1] && array[i - 1] > array[i - 2]))
    }
}

data class Employee(val name: String, val age: Int, val salary: Int)


fun Any.line() {
    repeat(50) { print(ColorUtils.ANSI_YELLOW + "=" + ColorUtils.ANSI_RESET) }
    println()
}