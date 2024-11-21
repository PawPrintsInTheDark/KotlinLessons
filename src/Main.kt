import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun main(){

    val persons = mutableListOf<Person>()
    val phones = mutableListOf<String>()

    val time = measureTimeMillis {
        withContext(newSingleThreadContext("my_thread")) {
            launch {
                getPersonsFlow().collect { persons.add(it) }
            }

            launch {
                getPhoneFlow(persons.size).collect { phones.add(it) }
            }
        }
    }
    val personInfo = persons.zip(phones) { person, phone ->
        "$person, $phone"
    }
    personInfo.forEach { println(it) }

    println(ColorUtils.ANSI_YELLOW + "\nЗатраченно времени $time mc")

}

private fun getPersonsFlow() = listOf(
    Person("Дима", "Директор"),
    Person("Аня", "Сисадмин"),
    Person("Андрей", "Менеджер"),
    Person("Виталий", "Разработчик")
).asFlow()

private fun getPhoneFlow(length: Int) = flow {
    repeat(length) {
        val num = Random.nextInt(1000000, 10000000)
        emit("+7917" + num)
    }
}


data class Person(val name: String, val role: String) {
    override fun toString(): String {
        return "Пользователь: $name, $role"
    }
}
