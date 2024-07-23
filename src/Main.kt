import kotlin.math.max
import kotlin.random.Random

fun main() {
    // 1. В задании не сказано делать реализацию, но я решил всё равно её сделать
    val policeDepartment = PoliceDepartment("Полиция", "88005553535")
    policeDepartment.activity()
    policeDepartment.getDescription()
    // 2.
    println("--------------------------------------------------------------------")
    print("Наибольший общий делитель: ")
    GCDEuclidean(40 , 130)
    println("--------------------------------------------------------------------")
    val arr = Array(12){Random.nextInt(0,51)}
    println(arr.contentToString())
    get2Max(arr)

}

fun get2Max(array: Array<Int>) {
    var max = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE
    for (i in array){
        if (i > max) {
            max2 = max
            max = i
        }
        if (i > max2 && i < max) max2 = i
    }
    println("второе максимальное число $max2")
}

fun GCDEuclidean(a: Int, b: Int) {
    if (a == 0 || b == 0) println(max(a, b))
    else return GCDEuclidean(b, a % b)
}





