import kotlin.random.Random

class BankCard(private val password: String) {
    val number = generateNumber()
    var code = generateCode()
        get(){
            var count = 3
            while (count-- > 0) {
                println("Введите пароль")
                val pass = readln()
                if (pass == password) {
                    println("Пароль введён верно")
                    return field
                } else {
                    println("Неверный пароль.")
                    if (count == 0){
                        println("Карта заблокированна.")
                    }
                    println("Осталось попыток: $count")
                    println("Повторите попытку")
                }
            }
            return -1
        }


    private fun generateNumber(): Long {
        var res = Random.nextLong() % 10000000000000000 // Ограничение на 16 знаков
        if (res < 0) {
            res *= -1
        }
        return res
    }

    private fun generateCode() : Int{
        return Random.nextInt(900) + 100
    }

}