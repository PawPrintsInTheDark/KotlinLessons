import kotlin.random.Random

fun main() {
    // 1.
    val box1 = Box(10, 10, 15)
    println("Объём коробки равен: " + box1.getVolume())
    // 2.
    val arr = Array(10) { Random.nextInt(1, 100) }
    println(arr.contentToString())
    getMaxMin(arr)
    // 3.
    println(arrayOf(3, 67, 1, 55, 65, 89, 23).contentToString())
    // 4.
    val a = 34
    val res = when {
        a > 0 && isEven(a) -> "положительное четное число"
        a > 0 && !isEven(a) -> "положительное нечётное число"
        a < 0 && isEven(a) -> "отрицательное  четное число"
        a < 0 && !isEven(a) -> "отрицательное  нечётное число"
        a == 0 -> "нулевое число"
        else -> "неизвестное число"
    }
    println("Число $a - $res")
    // 5.
    val car = Car(140,1200)
    car.move()
    car.stop()
}



fun isEven(i : Int) : Boolean{
    return i and 1 == 0
}

fun getMaxMin(arr : Array<Int>){
    var min = arr[0]
    var max = arr[0]
    for (i in arr){
        if(i > max) max = i
        if(i < min) min = i
    }
    println("Минимальный элемент набора : $min, Максимальный элемент набора $max")
}