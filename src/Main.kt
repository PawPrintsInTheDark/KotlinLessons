fun main() {
    // 1.
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list[0])
    println(list.first())
    line()
    // 2.
    println(list.average())
    println(sum(list).toDouble() / list.size)
    line()
    // 3.
    println(list.sum())
    println(sum(list))
    line()
    // 4.
    println(list.count())
    var count = 0
    for (i in list) {
        count++
    }
    println(count)
    line()
    // 5.
    println(list.takeLast(2).sum())
    var sumOfLast = 0
    for (i in list.size - 2..<list.size) {
        sumOfLast += list[i]
    }
    println(sumOfLast)
    line()
    // 6.
    println(list.indices.sum())
    var ind = 0
    for (i in list.indices){
        ind += i
    }
    println(ind)

}

fun sum(list: List<Int>): Int {
    var sum = 0
    for (i in list) {
        sum += i
    }
    return sum
}

fun line() {
    repeat(40) {
        print("=")
    }
    println()
}