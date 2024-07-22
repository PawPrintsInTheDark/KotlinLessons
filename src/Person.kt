abstract class Person(var name: String, var surname: String, var age: Int) {
    abstract fun toLive()
    abstract fun eat()
    abstract fun hangOut()

    fun goWash(){
        println("$name принимает душ")
    }

    override fun toString(): String {
        return "{name : $name, surname : $surname, age : $age}"
    }
}