fun main() {
    // 1.
    val pyaterochka = Pyaterochka(15)
    pyaterochka.isOpen(9)
    pyaterochka.deliveryOfGoods()
    pyaterochka.giveSalary()
    println("--------------------------------------")
    val magnit = Magnit(11)
    magnit.isOpen(23)
    magnit.deliveryOfGoods()
    magnit.giveSalary()
    // 2.
    println("=======================================")
    val student = Student("Cерёжа", "Груздев", 19)
    student.toLive()
    student.goWash()
    student.eat()
    println(student.toString())
    println("--------------------------------------")
    val employee = Employee("Владислав", "Владимирович", 32, "Yandex")
    employee.toLive()
    employee.goWash()
    employee.eat()
    println(employee.toString())
    println("=======================================")
    println("${conversion(1, 10.3)} дм")
    println("${conversion(2, 10.3)} км")
    println("${conversion(3, 10.3)} м")
    println("${conversion(4, 10.3)} мм")
    println("${conversion(5, 10.3)} см")
}

fun conversion(unit : Int, meters : Double): Double {
    return when(unit){
        1 -> meters * 10
        2 -> meters / 1000
        3 -> meters
        4 -> meters * 1000
        5 -> meters * 100
        else -> -1.0
    }
}



