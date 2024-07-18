import kotlin.random.Random

fun main() {
    println("Кол-во локальных минимумов: "+ localMin(1, 4, 2, 6, 7, 2, 1, 6, 8, 1, 8, 10, 2, 6, 4, 5))
    println("Изменённый массив: "+increase(1, 4, 2, 6, -71, 2, 1, 6, -4, 1, 8, 10, 2, 6, -5, 5).contentToString())
    val M = 5
    val N = 5
    val K = 3
    val arr = Array(M) { Array(N) { Random.nextInt(0, 100) } }
    for (i in arr) {
        for (j in i) {
            print("$j\t")
        }
        println()
    }
    strMatrix(arr, K)

}

fun localMin(vararg a: Int): Int {
    var res = 0
    for (i in 1..<a.size - 1) {
        if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
            res++
        }
    }
    return res
}

fun increase(vararg a: Int): IntArray {
    println("Начальный массив:  "+ a.contentToString())
    for (i in a.indices) {
        if (a[i] < 0) a[i]++
    }
    return a
}

fun strMatrix(arr : Array<Array<Int>> , str : Int){
    for (i in arr.indices) if (i == str-1) println("элементы ${str} строки данной матрицы: "+arr[i].contentToString())
}



