import kotlin.random.Random

fun main() {
    // 1.
    val arr = Array(3) { Array(3) { Random.nextInt(0, 100) } }
    for (i in arr) {
        for (j in i) {
            print("$j\t")
        }
        println()
    }
    val minArr = Array(3) { 0 }
    for (i in arr.indices) {
        minArr[i] = arr[i].min()
    }
    println("Минимальный элемент массива: ${minArr.min()}")
    // 2.
    val arr2 = Array(3) { Array(5) { Random.nextInt(0, 100) } }
    //var sum = 0
    for (i in arr2) {
        for (j in i) {
            print("$j\t")
            //sum += j
        }
        println()
    }
    // Сначала думал что надо найти среднее арифместическое, но потом понял что найти надо немного другое
    // println("Cреднее арифметическое массива: ${sum/15}")
    println("Cредний элемент массива: ${arr2.flatten()[arr2.flatten().size / 2]}")
    // 3.
    val s = 5 // изменяя размер матрицы, треугольник из едениц так же будет менять размер
    val arr3 = Array(s) { i ->
        Array(s) { j -> if (i + j >= s - 1 && i >= j) 1 else 0 }
    }
    for (i in arr3) {
        for (j in i) {
            print("$j\t")
        }
        println()
    }
    // 4.
    val arr4 = Array(15) { Random.nextInt(0, 100) }
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE
    for (num in arr4) {
        if (num > max1) {
            max2 = max1
            max1 = num
        } else if (num > max2 && max1 != num){
            max2 = num
        }
    }
    println(arr4.contentToString())
    println("1 Максимальное число: $max1")
    println("2 Максимальное число: $max2")
}



