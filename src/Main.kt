import kotlin.math.pow

fun main() {
    // 1.
    val arr = Array(10) { i -> i + 0.25 }
    println("array 1 = ${arr.contentToString()}")

    println("Произведение элементов массива: ${arr.reduce { i, j -> i * j }}")
    // 2.
    val arr2 = Array(8) { i -> (i+1) * (i+1) }
    println("array 2 = ${arr2.contentToString()}")
    println("Среднее арифметическое массива: ${arr2.average()}")
    // 3.
    val size = 15
    val arr3 = Array(size) { i -> i + 1 }
    println("array 3 = ${arr3.contentToString()}")
    val filterArr = arr3.filter { it % 2 == 0 }
    println("Все четные числа: $filterArr\nИ их кол-во: ${filterArr.size}")
    // 4.
    val n = 12
    val arr4 = Array(n) { i -> 2.0.pow(i + 1).toInt() }
    println("array 4 состоящий из степени 2 = ${arr4.contentToString()}")
}



