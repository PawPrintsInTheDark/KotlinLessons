fun main() {
    val phonesCity1 = listOf(
        IPhone(700.0),
        Samsung(500.0)
    )
    val phonesCity2 = listOf(
        IPhone(1000.0),
        Samsung(300.0),
    )

    val stores = listOf(CityStore("Москва", phonesCity1, true), CityStore("Омск", phonesCity2))

    while (true) {
        println("Добро пожаловать в интернет-магазин! Выберите город:")
        stores.forEachIndexed { index, store -> println("${index + 1}. ${store.cityName}") }
        println("0. Выход")

        val cityChoice = readLine()?.toIntOrNull() ?: 0
        if (cityChoice == 0) {
            break
        }
        val selectedStore = stores[cityChoice - 1]

        while (true) {
            println(
                "Выберите действие:\n" +
                        "1. Выбрать модель телефона для покупки\n" +
                        "2. Просмотреть статистику\n" +
                        "${if (selectedStore.hasRepairService) "3. Отремонтировать телефон\n" else ""}" +
                        "0. Выход"
            )

            when (readLine()?.toIntOrNull()) {
                1 -> {
                    println("Выберите модель телефона для покупки:")
                    selectedStore.availablePhones.forEachIndexed { index, phone ->
                        println("${index + 1}. ${phone.model}")
                    }
                    println("Введите номер модели или '0' для выхода:")
                    val modelChoice = readLine()?.toIntOrNull()

                    if (modelChoice == 0 || modelChoice == null) continue

                    if (modelChoice in 1..selectedStore.availablePhones.size) {
                        val selectedModel = selectedStore.availablePhones[modelChoice - 1]
                        selectedStore.sellPhone(selectedModel)
                    } else {
                        println("Некорректный выбор модели.")
                    }
                }

                2 -> println(selectedStore.getStatistics())
                3 -> if (selectedStore.hasRepairService){
                    selectedStore.offerRepair()
                }else println("Некорректный выбор действия.")
                0 -> {
                    println("Выход из приложения.")
                    break
                }

                else -> println("Некорректный выбор действия.")
            }

        }
    }
}
