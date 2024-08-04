fun main() {
    // 1.
    repeatPrint(3) { println("Привет Мир!") }
    // 2.
line("=")
    val a = arrayOf(1, 2, 3, 4, 5)
    val arithmeticMean = { arr: Array<Int> -> println("Cреднее арифметическое: "+ arr.sum().toDouble() / arr.size) }
    arithmeticMean(a)
    // 3.
line("=")
    val arr = arrayOf(1, -2, 3, 5, -67, 78, -9, 0, 24, 2, 83, -3)
    println(arr.filter { it > 0 })
    // 4.
line("=")
    val arr2 = arrayOf(10, 43, 12, 54, 23, 6, 1, 98, 1, 8)
    val processArr = { array: Array<Int> -> array.map { if (it % 2 == 0) it / 2 else it * 5 } }
    println(processArr(arr2))
}

fun repeatPrint(count: Int, print: () -> Unit) {
    repeat(count) {
        print()
    }
}

fun line(s : String){
    repeat(70){ print(s)}
    println()
}