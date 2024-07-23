open class Bird(var type: String, open val canFly: Boolean = true) {
    open fun makeSound() {
        println("Птица $type издает звук")
    }
}