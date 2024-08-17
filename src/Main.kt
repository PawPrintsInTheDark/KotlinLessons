
fun main() {
    // 1.

    val set = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(set.filter { it % 2 == 0 })
    println(set.filter { it % 2 == 1 })
    line()
    // 2.
    val set2 = set.map { it * 2 }
        .filter { it % 5 == 0 }
        .toSet()
    println(set2)
    line()
    // 3.
    val list = listOf(1,2,3,2,4,5,6,8,2,2)
    fun <T> removeDuplicates (collection: Collection<T>?): Set<T> {
        return collection?.toSet() ?: emptySet()
    }
    val unique = removeDuplicates(list)
    println(unique)
    line()
    // 4.
    val arr = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)
    val nonZeroArr = arr.filter { it != 0 }.toIntArray()
    val res = nonZeroArr.plus(IntArray(arr.size-nonZeroArr.size){0})
    println(res.contentToString())
}

fun line() {
    repeat(40) {
        print("=")
    }
    println()
}