import phone.IPhone
import phone.Nokia
import phone.Sony

fun main() {
    // 1.
    val cat = Cat("Кот", 7)
    val dog = Dog("Собака", 12)
    cat.besyukatya()
    cat.eat()
    dog.bark()
    dog.eat()
    // 2.
    val nokia = Nokia("3310")
    nokia.call("+78800553535")
    val sony = Sony("Xperia")
    sony.call("+78800553535")
    val iphone = IPhone("15") // В задании не понял логику, зачем наследоваться от класса IPhone поэтому не стал этого делать
    iphone.call("+78800553535")
    // 3.
    println("Элементы массива которые деляться на 5 на цело:")
    arrayOf(3, 67, 1, 55, 65, 89, 23).forEach { i -> if (i % 5 == 0) print("$i ") }
}

