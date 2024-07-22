fun main() {
    // 1.
    val myCard = BankCard("1234")
    println(myCard.number)
    println("Код карты: " + myCard.code)
    // 2.
    var a = 1
    a += 7
    a -= 4
    a *= 2
    a %= 3
    println(a)
    // 3.
    val b = 45
    revers(b)
}

fun revers(i: Int) {
    var num = i
    var temp2 = 0
    while (num != 0) {
        val temp = num % 10
        temp2 = temp2 * 10 + temp
        num /= 10
    }
    println(temp2)
}



