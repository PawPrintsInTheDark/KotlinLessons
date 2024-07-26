fun main() {
    // 1.
    val human =  Human("Игорь", 18)
    human.live()
    human.torso().exists(true)
    human.torso().Organs().isWorking()
    human.leg("Правая").move()
    human.leg("Левая").move()
    human.arm("Левая").move()
    human.arm("Правая").move()
    human.head("чего бы поесть", "котика бы погладить...", "много буковок, устал читать (⌐▨_▨)").think()
    // 2.
    println("----------------------------------------------------")
    val arr = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    println("Введите символы для поиска")
    val search = readln()
    if (search.isNotEmpty()){
        val searchRes = arr.filter{it.contains(search, true)}
        if (searchRes.isNotEmpty()){
            println("Результат поиска:")
            println(searchRes.toString())
        } else {
            println("Ничего не найдено")
        }
    } else {
        println("Вы не ввели символы для поиска.")
    }
    // 3.
    println("----------------------------------------------------")
    val array = arrayOf(4,76,1,7,0,1,7,8,6,3,870,2,0,65,23,5)
    var count = 0
    var countRes = 0
    for (i in array){
        if (i == 0 ){
            count++
        }
        if (count in 1..1) countRes++
    }
    println(--countRes)
}