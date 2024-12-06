fun main(){
//1.
    val strings = listOf("{([])}", "{([))}", "{{[])}")
    for (str in strings){
        println("Строка: $str, валидность: ${isValidBrackets(str)}")
    }
    line()
//2.
    val array = intArrayOf(1, 2, 3)
    permutations(array.toList()).forEach{ println(it)}
}

fun <T> permutations(list: List<T>): List<List<T>> {
    if (list.isEmpty()) return listOf(emptyList())
    return list.flatMap { element ->
        permutations(list.filter { it != element }).map { (listOf(element) + it) }
    }
}


fun line(){
    repeat(68){
        print("=")
    }
    println()
}

fun isValidBrackets(input: String): Boolean {
    val stack = mutableListOf<Char>()
    val bracketMap = mapOf('(' to ')', '{' to '}', '[' to ']')
    for (char in input){
        when{
            char in bracketMap.keys -> stack.add(char) // {
            char in bracketMap.values -> {
                if (stack.isEmpty() || bracketMap[stack.removeAt(stack.lastIndex)] != char)
                    return false
            }
        }
    }
    // Если стек пуст, все скобки были правильно закрыты
    return stack.isEmpty()
}