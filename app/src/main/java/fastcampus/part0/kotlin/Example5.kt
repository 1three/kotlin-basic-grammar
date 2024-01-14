package fastcampus.part0.kotlin

fun main() {
    max(10, 3)
    min(10, 3)
}

// 5-1. if
fun max(n: Int, m: Int) {
    // result : kotlin.Unit
    val result = if (n > m) println("큰 수는 $n")
    else if (n < m) println("큰 수는 $m")
    else println("$n = $m")

    println(result)
}

fun min(n: Int, m: Int) {
    val result = if (n > m) "작은 수는 $m" else if (n < m) "작은 수는 $n" else "$n = $m"

    println(result)
}

// 5-2. when
fun isHoliday(dayOfWeek: String) {

}