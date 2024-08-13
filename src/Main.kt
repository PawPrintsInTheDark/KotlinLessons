fun main() {
    // 1.
    val str = "12.3".toFloat()
    println(str.toInt())
    println(str)
    println(str.toInt().toString(2))
    // 2.
    line()
    fun <T> checkType(c: T): String {
        return when (c) {
            is Int -> "Это число"
            is String -> "Это строка"
            is Double, Float -> "Это число с плавающей точкой"
            is Char -> "Это символ"
            else -> c!!::class.simpleName.toString()
        }
        // return "Это тип - "+c!!::class.simpleName.toString()
    }
    println(checkType("Это строка"))
    println(checkType(11))
    println(checkType(12.2))
    println(checkType('1'))
    // 3.
    line()
    fun <T> sum(el: T) {
        when (el){
            is Int -> println(el+1)
            is String -> println(el.length +1)
            is IntArray -> println(el.sum())
        }
    }
    sum(1)
    sum("123")
    sum(intArrayOf(1,2,3,4))
}


fun line(){
    repeat(60) { print("=") }
    println()
}