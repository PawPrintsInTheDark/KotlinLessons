import kotlinx.coroutines.*

suspend fun main() = coroutineScope<Unit>{
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

    getServerData(persons)
    getServerData(weatherList)
    getServerData(list)

    println(ColorUtils.ANSI_GREEN +"Данные загружены" +ColorUtils.ANSI_RESET)
    println(persons)
    println(weatherList)
    println(list)
    println(ColorUtils.ANSI_GREEN+"Программа завершена")





}

private suspend fun <T> getServerData(data : List<T>){
    for (i in data){
        delay(1000L)
        println("Данные с сервера: $i")
    }
}

data class Person(val name : String,val age : Int)
data class Weather(val city : String, val description : String, val temp : Double)
fun Any.line() {
    repeat(60) { print(ColorUtils.ANSI_CYAN + "=" + ColorUtils.ANSI_RESET) }
    println()
}