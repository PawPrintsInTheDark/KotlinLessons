import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

const val pi = 3.14
fun main() {
    // 1.
    var a = 213
    var b = 190.0
    if (a < b) while (++a < --b); else while (++b < --a); // можно так
    println(b)
    println("Cреднее арифметическое равно ${(a + b) / 2.0}") // но этот способ короче и точнее
    // 2.
    val S = 50.24
    val D = sqrt(4 * S / pi)
    val L = pi * D
    println("Диаметр окружности: $D")
    println("Длина окружности: $L")
    // 3.
    val x1 = 1
    val y1 = 6
    val x2 = 8
    val y2 = 1
    val P = 2 * (abs(x2 - x1) + abs(y2 - y1))
    val Sp = abs(x2 - x1) * abs(y2 - y1)
    println("Периметр прямоугольника: $P")
    println("Площадь прямоугольника: $Sp")
    // 4.
    for (i in 0..9) {
        print("${2.0.pow(i).toInt()} ")
    }
    // 5.
    println("")
    var n = 20
    while (n >= 0) {
        if(n % 2 == 0) println(n)
        n--
    }
}


