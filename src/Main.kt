import kotlinx.coroutines.*
import java.util.concurrent.CancellationException
import kotlin.random.Random
import kotlin.system.exitProcess
import kotlin.system.measureTimeMillis

suspend fun main() = coroutineScope<Unit> {
    line()
    val time = measureTimeMillis {
        val num = getRandomList(10, 1..100)
        val chars = getRandomList(10)

        val intcount = async { unpack(num) }
        val charcount = async { unpack(chars) }

        println("\nОбщий размер полученного списка: ${intcount.await() + charcount.await()}")
        println(concatenate(num, chars))
    }
    println("${ColorUtils.ANSI_GREEN}Затрачено времени: $time мс")
}

fun <T> concatenate(vararg lists: List<T>): Pair<Int, MutableList<T>> {
    val l = mutableListOf<T>()
    lists.forEach {
        l.addAll(it)
    }
    return Pair(l.size, l)
}

suspend fun <T> unpack(list: List<T>): Int {
    val color = ColorUtils.getRandomColor()
    val count = list.fold(0) { count, i ->
        delay(1000L)
        print("$color$i ${ColorUtils.RESET}")
        count + 1
    }
    return count
}

fun getRandomList(size: Int, range: IntRange): List<Int> {
    return List(size) { Random.nextInt(range.first, range.last + 1) }
}

fun getRandomList(size: Int): List<Char> {
    val chars = ('а'..'я') + ('А'..'Я') + ('0'..'9')
    return List(size) { chars.random() }
}


fun Any.line() {
    repeat(60) { print(ColorUtils.ANSI_GREEN + "=" + ColorUtils.RESET) }
    println()
}