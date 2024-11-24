import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.awt.Color
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun main() {

    line()
    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).asFlow()

    println("Сумма квадратов:" + numList.map { it * it }.reduce { a, b -> a + b })

    line()
    //2
    val people = listOf(
        Person("Алексей", 25),
        Person("Мария", 30),
        Person("Дмитрий", 22),
        Person("Елена", 28),
        Person("Сергей", 35),
        Person("Анна", 27),
        Person("Иван", 40),
        Person("Ольга", 31),
        Person("Николай", 29),
        Person("Татьяна", 26)
    ).asFlow()

    println("Введите первый символ имени:")
    val firstChar = readLine() ?: ""
    println("Введите возраст:")
    val age = readLine()?.toIntOrNull() ?: -1

    people.getPerson(firstChar, age).collect { println(it) }

    line()
    // 3
    val names = listOf("Петр", "Николай", "Василий").asFlow()
    val card = names.map { generateCardNumber() }
    val password = names.map { generatePassword() }

    val persons = mutableListOf<Person2>()

    combine(names, card, password) { n, c, p ->
        Person2(n, c, p)
    }.collect { persons.add(it) }



    println(persons)
}

suspend fun <T1, T2, T3, R> combine(
    first: Flow<T1>,
    second: Flow<T2>,
    third: Flow<T3>,
    transform: suspend (T1, T2, T3) -> R
): Flow<R> {
    return first.zip(second) { t1, t2 -> t1 to t2 }.zip(third) { (t1, t2), t3 -> transform(t1, t2, t3) }
}

data class Person2(val name: String, val card: String, val password: String)

fun generateCardNumber(): String {
    return List(4) { Random.nextInt(1000, 9999) }.joinToString(" ")
}

fun generatePassword(): String {
    return Random.nextInt(1000, 9999).toString()
}

fun Flow<Person>.getPerson(first: String, age: Int): Flow<Person> {
    return this.filter { it.name.startsWith(first, ignoreCase = true) && it.age == age }
}

data class Person(val name: String, val age: Int)

fun line() {
    repeat(70) {
        print(ColorUtils.ANSI_CYAN + "=" + ColorUtils.ANSI_RESET)
    }
    println()
}