fun main() {
    // 1.
    println(factorial(5))
    // 2.
    println("----------------------------")
    println(tenDegree(3))
    // 3.
    println("----------------------------")
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    incrementArray(array)
    println(array.contentToString())
}

fun factorial(i : Int): Long {
    if(i == 0) return 1
    return i * factorial(i-1)
}

fun tenDegree(i : Int) : Int{
    if(i == 0) return 1
    return 10   * tenDegree(i -1)
}

fun incrementArray(array: Array<Int>, index: Int = 0) {
    if (index == array.size) return
    if (index % 2 == 0) array[index]++
    incrementArray(array, index+1)
}
