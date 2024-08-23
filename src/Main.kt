import kotlinx.coroutines.*
import java.util.concurrent.CancellationException
import kotlin.system.exitProcess

suspend fun main() = coroutineScope<Unit> {
    line()
    val payment = launch(start = CoroutineStart.LAZY) {
        println("Оплата продукта началась")
        delay(2000L)
        println("Сканирование и обработка...")
        delay(2000L)
        println("Покупка оплачена.")
    }
    val cancelPayment = launch(start = CoroutineStart.LAZY) {
        println("Отмена покупки...")
        delay(2000L)
        println("Покупка отменена.")
    }
    val goodbye = launch(start = CoroutineStart.LAZY) {
        println("До свидания")
    }


    println("Программа покупки продуктов")
    delay(1000L)
    println("Купить товар:\n1.Да\n2.Нет")

    when (readln()) {
        "1" -> payment.join()
        "2" -> cancelPayment.join()
        else -> println("Ошибка. Неверный выбор.")
    }

    goodbye.join()
    line()
    // 2.
    println("Начало программы")
    val job = launch {
        for (i in 1..4) {
            delay(1000L)
            println(i)
        }
    }
    val lazyjob = launch(start = CoroutineStart.LAZY) {
        delay(2500L)
        println("Произошел ленивый запуск")
    }

    val finishjob = launch(start = CoroutineStart.LAZY) { println("Программа завершена") }

    lazyjob.start()
    job.join()
    finishjob.join()

    line()

    //TODO Принудительно заканчиваю программу т.к. сама она это не делает.
    exitProcess(1)
}


fun Any.line() {
    repeat(60) { print(ColorUtils.ANSI_BLUE + "=" + ColorUtils.ANSI_RESET) }
    println()
}