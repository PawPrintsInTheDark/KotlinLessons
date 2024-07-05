const val PI = 3.14
fun main() {
    val a = 20
    val b = 10
    val d = 90
    val L = 658
    val A = 243
    val B = 25

    var P = a * 4
    var S = a * A
    println("Квадрат: P = $P | S = $S")

    P = 2 * (a + b)
    S = a*b
    println("Прямоугольник: P = $P | S = $S ")

    println("Окружность: L = " + PI*d)

    println("Кол-во полных метров в растоянии $L: "+ L/100+" m")
    println("Кол-во отрезков В, размещенных на отрезке А: "+ A/B)


}