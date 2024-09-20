import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext
import kotlin.random.Random

suspend fun main() {
    println("Программа работы с базой данных сотрудников")
    val personManager = PersonManager()
    while (true) {
        println("Добавить сотрудника:\n1. Да\n2. Нет")
        val choice = readLine()
        if (choice == "1") {
            println("Введите имя сотрудника:")
            val name = readLine() ?: ""
            println("Введите зарплату сотрудника:")
            val salary = readLine()?.toIntOrNull() ?: 0
            val person = Person(name, salary)
            personManager.addPerson(person)
            println("Сотрудник добавлен.")
        } else if (choice == "2") {
            break
        }
    }
    coroutineScope {
        val job = launch {
            println("Чтение базы данных:")
            personManager.addPassword()
            personManager.readDataPersonList()
        }
        launch {
            while (true) {
                if (readln() == "0") {
                    println("Завершение полной работы")
                    job.cancelAndJoin()
                    break
                }
            }
        }
    }
}

data class Person(val name: String, val salary: Int)


class PersonManager {
    private val personList = mutableListOf<Person>()
    val resultList = mutableMapOf<Person, Int>()

    suspend fun addPerson(person: Person) {
        personList.add(person)
    }

    suspend fun addPassword() {
        for (person in personList) {
            resultList[person] = (100000..999999).random()
            delay(500L)
        }
    }

    suspend fun readDataPersonList() {
        for ((key, value) in resultList) {
            println("Сотрудник: $key; пароль: $value")
            delay(1000L)
        }
    }

}


fun Any.line() {
    repeat(50) { print(ColorUtils.ANSI_YELLOW + "=" + ColorUtils.ANSI_RESET) }
    println()
}
