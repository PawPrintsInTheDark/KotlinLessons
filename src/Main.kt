fun main() {
    // 1.
    println(10 sum 2)
    println(10 sub 2)
    println(10 mul 2)
    println(10 div 2)
    // 2.
    val person = Person("Иван")
    person say "привет мир!"
    // 3.
    val point1 = Point(23.1, 43.6)
    val point2 = Point(54.23, 2.1)

    println(point1 isAbove point2)
    println(point1 isRightOf point2)

}

infix fun Int.sum(i: Int) = this + i
infix fun Int.sub(i: Int) = this - i
infix fun Int.mul(i: Int) = this * i
infix fun Int.div(i: Int) = this / i

class Person(val name: String) {
    infix fun say(msg: String) {
        println("$name говорит: $msg")
    }
}

infix fun Point.isAbove(p: Point) = this.y > p.y
infix fun Point.isRightOf(p: Point) = this.x > p.x

data class Point(val x: Double, val y: Double)