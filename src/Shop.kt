abstract class Shop(val name : String, val workersCount : Int) {
    abstract fun deliveryOfGoods()
    abstract fun giveSalary()
    fun isOpen(time : Int){
        if(time in 8..22) println("Магазин $name открыт") else println("Магазин $name закрыт")
    }

}
