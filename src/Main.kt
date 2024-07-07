fun main() {
    // 1.
    //    val mounth = readln().toInt()
    //    println("Введите номер месяца:")
    when (val mounth = 1) {
        12, 1, 2 -> {
            print("Зима: ")
            when (mounth) {
                12 -> println("Декабрь")
                1 -> println("Январь")
                2 -> println("Февраль")
            }
        }

        3, 4, 5 -> {
            print("Весна: ")
            when (mounth) {
                3 -> println("Март")
                4 -> println("Апрель")
                5 -> println("Май")
            }
        }

        6, 7, 8 -> {
            print("Лето: ")
            when (mounth) {
                6 -> println("Июнь")
                7 -> println("Июль")
                8 -> println("Август")
            }
        }

        9, 10, 11 -> {
            print("Осень: ")
            when (mounth) {
                9 -> println("Сентябрь")
                10 -> println("Октябрь")
                11 -> println("Ноябрь")
            }
        }

        else -> println("Ошибка, такого месяца не существует")
    }
    // 2.
    val num: Double = 34.54675
    val res = when (num % 1) {
        in 0.1..0.4 -> num.toInt()
        in 0.5..0.9 -> num.toInt() + 1
        else -> num
    }
    println(res)
    // 3.
    val time = 18
    when (time) {
        in 0..5 -> println("Раннее утро")
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 18..20 -> println("Вечер")
        in 21..23 -> println("Поздний вечер")
    }
    // 1.4 Даны две переменные a = 8, b = 5. Написать алгоритм, при котором a = 5, b = 8.
    // ???
    val a = 5;
    val b = 8

}
