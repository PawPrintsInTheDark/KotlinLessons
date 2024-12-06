class CityStore(val cityName: String, val availablePhones : List<Phone>,  val hasRepairService: Boolean = false) : Store {
     private val salesCount = mutableMapOf<Phone, Int>()
     private var repairOffered = false

    override fun sellPhone(phone: Phone) {
        salesCount[phone] = salesCount.getOrDefault(phone, 0) + 1
        println("Вы купили ${phone.model} за ${phone.price} рублей.")
    }

    override fun getStatistics() : String{
        val stats = salesCount.map { "${it.key}: ${it.value} продано" }.joinToString("\n")
        return "Статистика продаж  в магазине $cityName:\n$stats "
    }

    override fun offerRepair(): Boolean {
        if (!hasRepairService) {
            println("Ремонтная мастерская недоступна в этом магазине.")
            return false
        }
        if (!repairOffered) {
            println("Хотите отремонтировать свой телефон? (да/нет)")
            return if (readlnOrNull().equals("да", ignoreCase = true)) {
                println("Ваш телефон отремонтирован.\n")
                repairOffered = true
                true
            } else {
                println("Вы не нуждаетесь в ремонте.\n")
                false
            }
        } else {
            println("Ремонт уже предлагался.\n")
            return false
        }
    }
}
