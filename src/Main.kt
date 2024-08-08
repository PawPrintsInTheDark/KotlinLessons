fun main() {
    // 1.
    print(1)
    print("Привет")
    print(true)
    print(100L)
    print(.2f)
    // 2.
    val p1 = Person("+78800553535", "Ivan")
    val p2 = Person(88800553535, "Ivan")
    println(p1)
    println(p2)
    // 3.
    printWrapper(10, '{')
    printWrapper("Hello", '[')
    printWrapper(listOf(1, 2, 3, 4, 5), '[')
    printWrapper(arrayOf("one", "two", "three"), '*')
    printWrapper(1.1f, '(')

}

fun <T> printWrapper(d: T, c: Char) {
    val reversc = when (c) {
        '{' -> '}'
        '(' -> ')'
        '[' -> ']'
        '<' -> '>'
        else -> c
    }
    when (d) {
        is List<*> -> println("$c${d.joinToString(", ")}$reversc")
        is Array<*> -> println("$c${d.joinToString(", ")}$reversc")
        else -> println("$c$d$reversc")
    }
}

fun <T> print(s: T) {
    println("\'$s\' типа ${s!!::class.java}")
}

class Person<T>(val number: T, val name: String) {
    override fun toString(): String {
        return "name = $name, phone = $number"
    }
}