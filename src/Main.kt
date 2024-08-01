fun main() {
    // 1.
    val strArr = arrayOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь")
    val max = strArr.maxBy { s -> s.length }
    println("Самое длинное слово: $max")
    println("Кол-во символов в слове: ${max.length}")
    // 2.
    println("-----------------------------------------------")
    val matrix = Array(4) { i -> Array(4) { j -> i * 4 + j + 1 } }
    for (row in matrix) {
        println(row.joinToString("\t"))
    }
    var sum = 0
    for (i in matrix.indices) {
        sum += matrix[i][matrix.size - 1 - i]
    }
    println("Сумма элементов побочной диагонали матрицы: $sum")
    // 3.
    println("-----------------------------------------------")
    val hp = object : Printer("HP") {
        override fun print() {
            println("Принтер $brand печатает...")
        }
    }
    hp.print()
    val canon = object : Printer("Canon"){
        val type = "Лазерный"
        override fun print() {
            println("$type принтер $brand печатает...")
        }
    }
    canon.print()
}

abstract class Printer(val brand: String) {
    abstract fun print()
}
