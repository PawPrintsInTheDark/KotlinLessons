class Magnit(workersCount: Int) : Shop("Магнит", workersCount) {
    override fun deliveryOfGoods() {
        println("Привезли новый товар в магазин $name, ${workersCount / 3} работников(a) направленны на разгрузку")
    }

    // Я не знаю дают ли магнитики вместо з/п работникам Магнита, но я рашил сделать такую реализацию функции,
    // чтобы показать различие с реализацией Пятёрочки
    override fun giveSalary() {
        if (workersCount <= 10) {
            println("Выдана з/п ${workersCount} сотрудникам")
        } else {
            val temp = workersCount - 2
            println("Выдана з/п $temp сотрудникам")
            println("Оставшимся ${workersCount - temp} работникам выданы магнитики")
        }
    }

}