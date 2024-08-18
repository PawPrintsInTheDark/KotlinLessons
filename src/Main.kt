
fun main() {
    // 1.
    val arr = arrayOf(2, 4, 7, 1, 2, 4)
    println(count(arr).toString())
    line()
    // 2.
    val people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна")
    deleteElement(people)
    println(people)
    line()
    // 3.
    val personHashMap = hashMapOf(1 to Person("Иван", 13,"Посудомойщик"),
        2 to Person("Андрей", 23,"Дизайнер"),
        3 to Person("Анна", 32,"Аналитик"),
        4 to Person("Лёша", 29,"Инжинер"))
    for((key,value ) in personHashMap){
        println("$key: $value")
    }
}

data class Person(val name: String, val age : Int, val post : String)

fun deleteElement(map : MutableMap <Int,String>){
    println("Введите значение которое хотите удалить.")
    val rd = readln()
    if (map.containsValue(rd)) {
        map.remove(map.entries.first{it.value == rd}.key)
    }else println("Такого значения нет")
}

fun <K> count(arr : Array<K>) :Map<K, Int>{

    val map = mutableMapOf<K, Int>()

    for (i in arr){
        if (map.containsKey(i)){
            map[i] = map[i]!! +1
        }else map[i] = 1
    }
    return map

//    return arr.groupingBy { it }.eachCount()
}

fun line() {
    repeat(40) {
        print("=")
    }
    println()
}