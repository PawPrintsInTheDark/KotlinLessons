fun main() {
    // 1.
    val f = fun(name: String, year: Int) = "$name поздравляю тебя с наступающим новым $year годом!"
    println(f("Киану", 2077))
    //2
    println("------------------------------------")
    val isEven = fun(i: Int) = i % 2 == 0
    val arr = arrayOf(1, 2, 3, 4, 5, 6)
    checkArrayElement(arr, isEven)
    // 3.
    println("------------------------------------")
    val concat = fun(str1: String, str2: String) = str1+str2
    println(concat("Hello ","World!"))

}

fun checkArrayElement(arr: Array<Int>, op: (Int) -> Boolean) {
    println("Чётные: ${arr.filter { op (it)}}")
    println("Нечётные: ${arr.filter { !op(it) }}")
}
