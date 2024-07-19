class Pet {
    var alias = "undefined"
    var weight = 0
    var type = "undefined"

    fun announce(){
        println("Домашнее животное: $type " +
                "Кличка: $alias " +
                "Вес: $weight кг")
    }
}