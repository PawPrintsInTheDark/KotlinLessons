class Car (val speed : Int, val weight : Int) {
    fun move(){
        println("Машина движется со скоростью $speed км/ч")
    }
    fun stop(){
        println("Машина остановилась")
    }
}