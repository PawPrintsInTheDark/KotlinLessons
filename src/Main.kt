import kotlin.random.Random

fun main() {
    val reg = Registration("privet@mail.ru")
    println(reg.getEmail())
    reg.setPassword("1234")
    reg.setPassword("123456")
    println(reg.getPassword())

    val arr = Array(4) { Array(4) { Random.nextInt(0, 100) } }
    showArray(arr)
    println("Чётные числа:")
    getEven(arr)
    val arr2 = filling()
    showArray(arr2)
    val arr3 = Array(4) { Array(4) { Random.nextInt(-100, 100) } }
    showArray(arr3)
    println("Положительные числа:")
    positiveOnly(arr3)
}

fun getEven(arr: Array<Array<Int>>){
    for (i in arr) {
        for (j in i) {
            fun check(){
                if (j % 2 ==0) print("$j ")
            }
            check()
        }
    }
    println("\n")
}

fun filling() : Array<Array<Int>>{
    var i = 1
    return Array(4){Array(4){ i++ }}
}

fun positiveOnly(arr : Array<Array<Int>>){
    for (i in arr) {
        for (j in i) {
            if (j >= 0) print("$j ")
        }
    }
    println("\n")
}

// Utils
fun showArray(arr : Array<Array<Int>>){
    for (i in arr) {
        for (j in i) {
            print("$j\t")
        }
        println()
    }
    println()
}
