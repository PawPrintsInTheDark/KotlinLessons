class Chiken() : Bird("Курица") {

    override val canFly = false

    override fun makeSound() {
        println("$type кудахчит")
    }
}