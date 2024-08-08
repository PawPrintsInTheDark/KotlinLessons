fun main() {
    // 1.
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    val states = States<Int>()
    println(states.getAverage(arr))
    // 1.2
    val arr2 = arrayOf(1, 2, 34, 567, 89, 0)
    val arr3= arrayOf("one","two","three")
    val gen = GenericMethod()
    println(gen.isItIncluded(3, arr2))
    println(gen.isItIncluded("one", arr3))

}

class States<T> where T : Number {
    fun getAverage(arr: Array<T>): Double {
        return arr.sumOf { it.toDouble() } / arr.size
    }
}

class GenericMethod {
    fun <T> isItIncluded(el: T, arr: Array<T>): Boolean {
        return arr.contains(el)
    }
}