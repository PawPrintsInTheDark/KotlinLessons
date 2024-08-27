import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun main() = coroutineScope<Unit>{
    println("${ColorUtils.ANSI_CYAN}┌───(${ColorUtils.ANSI_GREEN}Загрузка данных с сервера${ColorUtils.ANSI_CYAN})".padEnd(106, '─')+"${ColorUtils.ANSI_CYAN}┐${ColorUtils.ANSI_RESET}")
    val time = measureTimeMillis {
        val persons = listOf(
            Person("Алексей", 30),
            Person("Мария", 25),
            Person("Иван", 40),
            Person("Елена", 35)
        )

        val weatherList = listOf(
            Weather("Москва", "Облачно", 20.4),
            Weather("Санкт-Петербург", "Дождь", 7.5),
            Weather("Новосибирск", "Солнечно", 13.0),
            Weather("Екатеринбург", "Снег", -2.0)
        )

        val list = List(10) { (1..100).random() }

        val personJob = async { getServerData(persons) }
        val weatherJob = async { getServerData(weatherList) }
        val listJob = async { getServerData(list) }

        personJob.await()
        weatherJob.await()
        listJob.await()

        println("${ColorUtils.ANSI_CYAN}├───(${ColorUtils.ANSI_GREEN}Данные загружены${ColorUtils.ANSI_CYAN})".padEnd(106, '─')+"${ColorUtils.ANSI_CYAN}┤${ColorUtils.ANSI_RESET}")
        persons.forEach{println("${ColorUtils.ANSI_CYAN}│${ColorUtils.ANSI_RED} $it".padEnd(101) + ColorUtils.ANSI_CYAN + "│" + ColorUtils.ANSI_RESET)}
        weatherList.forEach{println("${ColorUtils.ANSI_CYAN}│${ColorUtils.ANSI_BLUE} $it".padEnd(101) + ColorUtils.ANSI_CYAN + "│" + ColorUtils.ANSI_RESET)}
        println("${ColorUtils.ANSI_CYAN}│${ColorUtils.ANSI_RESET}" + ColorUtils.ANSI_YELLOW + list.toString().padEnd(90) + "${ColorUtils.ANSI_CYAN}│${ColorUtils.ANSI_RESET}")
        line("└","┘")
        println(ColorUtils.ANSI_GREEN + "\nПрограмма завершена"+ColorUtils.ANSI_RESET)


    }
    println(ColorUtils.ANSI_YELLOW+"\nЗатраченно времени $time mc")


}

private suspend fun <T> getServerData(data : List<T>){
    for (i in data){
        delay(1000L)
        println("${ColorUtils.ANSI_CYAN}│${ColorUtils.ANSI_RESET} Данные с сервера: $i".padEnd(100) + ColorUtils.ANSI_CYAN + "│" + ColorUtils.ANSI_RESET)

    }
}

data class Person(val name : String,val age : Int)
data class Weather(val city : String, val description : String, val temp : Double)
fun Any.line(ch1: String = "", ch2: String = "") {
    if (ch1.isEmpty()) {
        repeat(90) { print(ColorUtils.ANSI_CYAN + "─" + ColorUtils.ANSI_RESET) }
        println()
    }else{
        print(ColorUtils.ANSI_CYAN +ch1)
        repeat(90) { print("─")}
        print(ch2+ ColorUtils.ANSI_RESET)
        println()
    }
}