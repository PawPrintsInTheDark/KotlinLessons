class Pyaterochka(workersCount : Int) : Shop("Пятёрочка", workersCount) {
    override fun deliveryOfGoods() {
        println("Привезли новый товар в магазин $name, ${workersCount/2} работников(a) направленны на разгрузку")
    }

    override fun giveSalary() {
        println("Выдана з/п $workersCount сотрудникам")
    }
}