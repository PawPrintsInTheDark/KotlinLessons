class Student(name: String, surname : String, age : Int) : Person(name, surname, age) {
    override fun toLive() {
        println("$name ходит в университет, учится, подрабатывает на подработках, а так же тусуется с друзьями")
    }

    override fun eat() {
        println("$name $surname ест пельмени")
    }

    override fun hangOut() {
        println("$name пошёл на шашлыки с друзьями")
    }

}