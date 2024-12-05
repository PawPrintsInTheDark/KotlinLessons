class CityStore(private val cityName: String) : Store {
    private val availablePhones = listOf(IPhone(), Samsung())
    private val salesStatistics = mutableMapOf<Phone, Int>()
    private var repairOffered = false

    override fun sellPhone(phone: Phone) {
        salesStatistics[phone] = salesStatistics.getOrDefault(phone, 0) + 1
        println("Вы купили ${phone.model} за ${phone.price} рублей.")
    }

    override fun getStatistics() {
        println("Статистика продаж в магазине $cityName:")
        for ((phone, count) in salesStatistics) {
            println("${phone.model}: $count продано.")
        }
    }

    override fun offerRepair(): Boolean {
        if (!repairOffered) {
            repairOffered = true
            println("Хотите отремонтировать свой телефон? (да/нет)")
            val response = readLine()
            return if (response.equals("да", ignoreCase = true)) {
                println("Ваш телефон отремонтирован.")
                true
            } else {
                println("Вы не нуждаетесь в ремонте.")
                false
            }
        } else {
            println("Ремонт уже предлагался.")
            return false
        }
    }
}
