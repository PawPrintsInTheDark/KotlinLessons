fun main() {
    // 1.
    val bird = Bird("Дятел")
    bird.makeSound()
    printLine()
    val chiken = Chiken()
    println(chiken.canFly)
    chiken.makeSound()
    printLine()
    val cuckoo = Cuckoo()
    println(cuckoo.canFly)
    println("Кукушка сколько дней мне до выходных")
    cuckoo.makeSound()
    printLine()
    // 2.
    val arr = arrayOf("привет", "World", "Kotlin", "коты", "шторы", "подушка", "массив", "слов", "камин","цветочки")
    println(arr.contentToString())
    findLongestWord(arr)
    printLine()
    // 3.
    val str = "ПриВет, кАк деЛа"
    val l = str.filter { it.isUpperCase() }
    println("Символы находящиеся в верхнем регистре: $l")
    println("Их кол-во ${l.length}")
}

fun findLongestWord(arr: Array<String>) {
    var maxStr = ""
    for (i in arr) if (maxStr.length < i.length) maxStr = i
    println("самое длинное слово в массиве: $maxStr")
    println("И количество букв в этом слове: ${maxStr.length}")
}

fun printLine(){
    repeat(50){ print("-")}
    println()
}