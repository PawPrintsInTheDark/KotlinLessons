fun main() {
    // 1.
    val c1 = "#ff00ff"
    val c2 = "#0022ff"
    var res = action(c1, c2, ::mixHexColors)
    println("Результат смешения цветов $c1 и $c2 : $res")
    res = action("красный", "синий", ::mixColor)
    println(res)
    // 2.
    println("-----------------------------------------")
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val multArray = modifyArray(numbers, ::mult)
    println(multArray)
    val incArray = modifyArray(numbers, ::inc)
    println(incArray)
}

fun mult(i: Int) = i * 2
fun inc(i: Int) = i + 1

fun modifyArray(arr: Array<Int>, op: (Int) -> Int): List<Int> {
    return arr.map(op)
}

fun action(c1: String, c2: String, op: (String, String) -> String): String {
    return op(c1, c2)
}

fun mixColor(c1: String, c2: String): String {
    return "Цвета $c1 и $c2 смешанны."
}

fun mixHexColors(hex1: String, hex2: String): String {
    val color1 = hex1.removePrefix("#")
    val color2 = hex2.removePrefix("#")

    val r1 = color1.substring(0, 2).toInt(16)
    val g1 = color1.substring(2, 4).toInt(16)
    val b1 = color1.substring(4, 6).toInt(16)

    val r2 = color2.substring(0, 2).toInt(16)
    val g2 = color2.substring(2, 4).toInt(16)
    val b2 = color2.substring(4, 6).toInt(16)

    val rMixed = (r1 + r2) / 2
    val gMixed = (g1 + g2) / 2
    val bMixed = (b1 + b2) / 2

    return "#${rMixed.toString(16)}${gMixed.toString(16)}${bMixed.toString(16)}"
}