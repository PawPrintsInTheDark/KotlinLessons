fun main() {
    // 1.
    println("Введите десятичное число")
    val a = readln().toIntOrNull() ?: 0
    println(a.toString(2))
    println("--------------------------------------------------")

    // 2.
    println("Введите двоичное число")
    val b = readln()
    if (b.all { it in '0'..'1' }) println(b.toInt(2)) else println("Неверно введено число")
    println("--------------------------------------------------")

    // 3.
    println("Введите слово")
    val str = readln()
    if (str.reversed() == str) println("Слово \'$str\' палиндром") else println("Слово \'$str\' палиндромом не является")
}
