fun main() {

    val catalog = Catalog()
    val users = arrayOfNulls<String>(10)
    catalog.greeting()
    catalog.createList(users)


}

class Catalog {
    fun greeting() {
        println("Добро пожаловать в каталог пользователей о.о")
    }

    fun createList(list: Array<String?>) {
        while (true) {
            println("Введите имя и фамилию пользователя (или 'exit' для выхода):")
            val input = readln()
            if (input.lowercase() == "exit") break
            try {
                if (input.isBlank()) throw MyException("Имя не может быть пустым")

                println("Введите позицию (0-9) куда добавим пользователя '$input':")
                val pos = readLine()?.toIntOrNull()

                if (pos == null || pos !in list.indices) {
                    throw MyException("Неверная позиция. Пожалуйста, введите число от 0 до 9.")
                }
                if (list[pos] == null) {
                    list[pos] = input
                    println("Пользователь $input добавлен под индексом $pos")
                } else {
                    println("Позиция $pos уже занята. Пожалуйста, выберите другую позицию.")
                }
            } catch (e: MyException) {
                println(e)
            } finally {
                println("Текущий каталог пользователей: ${list.joinToString(", ") { it ?: "null" }}")
            }
        }
    }
}

class MyException(msg: String) : Exception("Ошибка: $msg")