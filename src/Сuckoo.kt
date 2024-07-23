import kotlin.random.Random

class Cuckoo : Bird("Кукушка") {
    override val canFly = true

    override fun makeSound() {
        println("$type кукукает ${Random.nextInt(1,8)} раз")
    }
}