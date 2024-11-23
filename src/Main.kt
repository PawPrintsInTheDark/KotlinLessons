import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun main() = coroutineScope<Unit>{
    println("Введите количество пользователей для создания паролей:")
    val userCount = readLine()?.toIntOrNull() ?: return@coroutineScope
    println("Введите первый символ для паролей:")
    val firstChar = readLine() ?: return@coroutineScope
    val time = measureTimeMillis {

        val idFlow = getIdFlow(userCount).toList()
        val passwordFlow = getPasswordFlow(firstChar,userCount).toList()

        val result = idFlow.zip(passwordFlow).toMap()
        println("Сгенерированные пароли:")
        result.forEach { (id, password) ->
            println("ID: $id, Пароль: $password")
        }
    }

    println(ColorUtils.ANSI_YELLOW + "\nЗатраченно времени $time mc")

}

fun createPassword(): String {
    val characters = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    var password = ""
    for (i in 0..5) {
        val char = characters.random()
        password += if (i % 2 == 0) char.uppercaseChar() else char
    }
    return password
}

fun getListOfPassword(input: String, length: Int): List<String> {
    return List(length) {
        val password = createPassword()
        if (password.startsWith(input, ignoreCase = true)) password else getListOfPassword(input, 1)[0]
    }
}

fun getListId(length: Int): List<String> {
    return List(length) { String.format("%06d", it + 1) }
}

fun getIdFlow(length: Int) = getListId(length).asFlow()

fun getPasswordFlow(input: String, length: Int) = getListOfPassword(input, length).asFlow()