import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlin.coroutines.coroutineContext
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun main() {
    // 1
    println().line()
    val time = measureTimeMillis {
        coroutineScope {
            val channelOne = getStringList(Storage().text)
            val channelTwo = getList(channelOne)
            val channelThree = modifiedList(channelTwo)
            val strBuilder = StringBuilder()
            channelThree.consumeEach { strBuilder.appendLine(it) }
            val stringResult = strBuilder.toString()
            println(stringResult).line()
            // 2
            stringResult.split("\n").map {
                if (it.isNotEmpty()) {
                    it.split(" ").map { it.first() }.joinToString(", ")
                } else ""
            }.forEach { println(it) }.line()
        }
    }

    println(ColorUtils.ANSI_GREEN, "Затраченное время: $time мс")

}

suspend fun CoroutineScope.modifiedList(channel: ReceiveChannel<String>): ReceiveChannel<String> = produce {
    channel.consumeEach {
        if (it.isNotEmpty()) {
            send(it.split(" ").map { it.first().uppercase() + it.drop(1) }.joinToString(" "))
        }
    }
}

suspend fun CoroutineScope.getStringList(text: String): ReceiveChannel<String> = produce {
    text.split("\n").forEach { i -> send(i) }
}

suspend fun CoroutineScope.getList(channel: ReceiveChannel<String>): ReceiveChannel<String> = produce {
    channel.consumeEach {
        send(it)
        delay(10L)
    }
    close()
}

class Storage() {

    val text = "Мартышка к старости слаба глазами стала;\n" +
            "А у людей она слыхала,\n" +
            "Что это зло еще не так большой руки:\n" +
            "Лишь стоит завести Очки.\n" +
            "Очков с полдюжины себе она достала;\n" +
            "Вертит Очками так и сяк:\n" +
            "То к темю их прижмет, то их на хвост нанижет,\n" +
            "То их понюхает, то их полижет;\n" +
            "Очки не действуют никак.\n" +
            "«Тьфу пропасть! — говорит она, — и тот дурак,\n" +
            "Кто слушает людских всех врак;\n" +
            "Всё про Очки лишь мне налгали;\n" +
            "А проку на-волос нет в них».\n" +
            "Мартышка тут с досады и с печали\n" +
            "О камень так хватила их,\n" +
            "Что только брызги засверкали.\n" +
            "\n" +
            "К несчастью, то ж бывает у людей:\n" +
            "Как ни полезна вещь, — цены не зная ей,\n" +
            "Невежда про неё свой толк все к худу клонит;\n" +
            "А ежели невежда познатней,\n" +
            "Так он её ещё и гонит."
}


fun Any.line() {
    repeat(50) { print(ColorUtils.ANSI_YELLOW.code + "=" + ColorUtils.ANSI_RESET.code) }
    println()
}

fun println(color: ColorUtils, str: Any) {
    println(color.code + str + ColorUtils.ANSI_RESET.code)
}
