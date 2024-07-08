fun main() {
    //TODO прошлое невыполненное задание по оператору when
    // 1.4 Даны две переменные a = 8, b = 5. Написать алгоритм, при котором a = 5, b = 8.
    var a = 8
    var b = 5
    println("Исходные значения: а = $a, b = $b")
    // 1 способ
    a = a xor b // можно так же, но через - и +
    b = a xor b
    a = a xor b
    println("После перестановки: а = $a, b = $b")
    // 2 способ
    a = b.also { b = a }

    println("После перестановки: а = $a, b = $b")
    // TODO While, Do-while
    // 1.
    println("Введите число:")
    var num = readln().toInt()
    var res = 1
    while (num != 1) res *= num--
    println("Факториал числа = $res")
    // 2.
    val count = 10
    val price = 77
    var i = 1
    while (i <= count) println("Стоимость $i кг конфет: ${price * i++} руб.")
    // 3.
    var A = 10
    val B = 32
    println("Кол-во чисел: ${B-A}")
    while (A <= B) print("${A++} ")
    // 4. Сначала не понял, а потом как понял
    var N = 12345
    println("")
    while (N > 0){
        print("${N % 10}")
        N /= 10
    }
    // 5.
    println("")
    var f = 1
    while (f++ < 20 ) if (f == 19) break else if (f % 2 == 0) if (f % 4 == 0) print("${f * 2} ") else print("$f ")
    // 6.
    println("")
    var deposit = 350.0
    var month = 9
    while (month-- >= 1){
        deposit += deposit * 0.07
    }
    println("Конечная сумма вклада = %.2f".format(deposit))
}


