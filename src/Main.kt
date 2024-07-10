import kotlin.math.pow

fun main() {
    // 1.
    val num = 12
    var res = 0.0
    for (t in 1..num){
        res += 1.0 / t
    }
    println("%.2f".format(res))
    // 2.
    var a = 2
    val b = 12
    var res1 = 0
    while (a <= b) {
        res1 += a.toDouble().pow(2.0).toInt()
        a++
    }
    println("Cумма квадратов = $res1")
    // 3.
    val A = 3
    val B = 8
    var d = 0
    for (t in A..B) {
        repeat(d) { print("${t}, ") }
        d++
    }
    // 4.
    println("")
    val isSimple = 11
    if (isSimple <= 1) println("Число $isSimple не простое")
    else if (isSimple == 2) println("Число $isSimple простое")
    else if (isSimple % 2 == 0) println("Число $isSimple не простое ")
    else {
        var y = 3
        while (y * y <= isSimple) {
            if (isSimple % y == 0) return println("$isSimple не простое")
            y += 2
        }
        println("Число $isSimple простое")
    }
    // 5.
    println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
    while (true) {
        val str = readln()
        if (str.equals("Сдаюсь", true)) {
            println("Правильный ответ: троллейбус.")
            return
        } else if (str.equals("Троллейбус", true)) {
            println("Правильно!")
            return
        } else println("Подумай еще.")
    }
}



