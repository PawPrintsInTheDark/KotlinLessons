class Employee(name: String, surname: String, age: Int, private val companyName: String) : Person(name, surname, age) {
    override fun toLive() {
        println("$name ходит на работу в $companyName, поднимается по карьерной лестнице и ходит на корпаративы с коллегами")
    }

    override fun eat() {
        println("$name $surname трапезничает в ресторане")
    }

    override fun hangOut() {
        println("$name поехал в отдыхать в баню с друзьями и коллегами по работе из $companyName")
    }

    override fun toString(): String {
        return "{name : $name, surname : $surname, age : $age, companyName : $companyName }"
    }


}