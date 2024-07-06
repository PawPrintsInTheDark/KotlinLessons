const val PI = 3.14
fun main() {
    // 1.
    var a = 20
    if (a > 0) {
        a++
        println(a)
    }
    // 2.
    var i = 0
    if (4 > 0) i++
    if (45 > 0) i++
    if (-2 > 0) i++
    if (8 > 0) i++
    println("Кол-во положительных чисел: $i")
    // 3.
    val c = 20
    val d = 34
    println(if (c > d) c else d)
    // 4.
    val num = 7
    println(
        if (num == 1) "Понедельник" else if (num == 2) "Вторник"
        else if (num == 3) "Среда" else if (num == 4) "Четверг"
        else if (num == 5) "Пятница" else if (num == 6) "Суббота"
        else "Воскресенье"
    )
    // 5.
    val R = 43
    println(
        if (R == 1) "Плохо" else if (R == 2) "Неудовлетворительно"
        else if (R == 3) "Удовлетворительно" else if (R == 4) "Хорошо"
        else if (R == 5) "Отлично" else "Ошибка"
    )
    // 6.
    val action = 1
    val e = 3.2
    val t = 45.4
    println(
        if (action == 1) e+t else if (action == 2) a-t
        else if (action == 3) e*t else e/t
    )
}