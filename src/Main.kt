fun main() {
    println(pow(3,3))
    println(calculate(2,4))
    println(GCD(1200,120))
}

fun pow(a : Int, n : Int) : Int{
    var res = a
    repeat(n-1){res *= a}
    return res
}

fun calculate(a : Int, b : Int) : Int{
    var res = 1
    for(i in a..b){
        res *= i
    }
    return res
}

fun GCD(a: Int,b: Int) : Int{
    var del = 0
    var i = 1
    while (i <= a && i <= b){
        if(a % i == 0 && b % i == 0 ) del = i
        i++
    }
    return del
} // Не очень быстрый код, но зато решил сам, потом уже почитал про решение через Алгоритм Евклида

