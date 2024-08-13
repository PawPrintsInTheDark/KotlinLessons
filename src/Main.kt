fun main() {
    // 1.
    fun printFavoriteBook(book: String?) {
        println(book ?: "У меня нет любимой книги")
    }
    printFavoriteBook(null)
    printFavoriteBook("Гарри Поттер")
    // 2.
    fun DivideIfWhole(n1: Int, n2: Int): Int? {
        if (n2 == 0) return null
        return if (n1 % n2 == 0) n1 / n2
        else null
    }
    println(DivideIfWhole(10, 4)?: 0)
    println(DivideIfWhole(10, 5)?: 0)
    println(DivideIfWhole(0, 0)?: 0)
    // 3.
    val array = arrayOf("Привет","как", null, "дела")
    val array2 = array.filterNotNull()
    println(array2)
}