fun main() {
    // 1.
    "Hello World".let { println("объект - $it, длина строки - ${it.length} ") }
    // 2.
    val city = City("Moscow").apply { population = 12_822_748 }
    city.apply { println("Город (${name}), популяция - ${population}") }
    // 3.
    val arg = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    with(arg) {
        println("Массив: "+ contentToString())
        println("Кол-во элементов массива: $size")
        println("Cумма элементов массива: ${sum()}")
    }
}

class City(val name: String = "", var population: Long = 0)