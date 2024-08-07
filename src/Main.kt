fun main() {
    // 1.
    val str = "Занятие"
    str.forEach { print("$it ") }
    println()
    // 2.
    val num = "+79992245491"
    println(checkNum(num))
    // 3.
    val str2 = "Привет Мир!"
    println(str2.reversed())
    // 4.
    val str3 = "kotlin2023course"
    println(str3.count { it.isDigit() })
}
fun checkNum(num: String): Boolean {
    return if (num.startsWith("+7") && num.length == 12 && num.substring(2).all{ it.isDigit() }) return true else false
}