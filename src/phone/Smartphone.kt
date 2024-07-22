package phone

open class Smartphone(val brand: String, val model: String, val os : String) {
    open fun call(number: String) {
        println("Вызов на номер $number с $brand $model")
    }
}