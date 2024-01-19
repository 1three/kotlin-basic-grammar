package fastcampus.part0.kotlin.basic

fun main() {
    max(10, 3)
    min(10, 3)
    isHoliday("월")
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
fun isHoliday(dayOfWeek: Any) {
    val result = when (dayOfWeek) {
        "토", "일" -> if (dayOfWeek == "토") "토요일 좋아 :)" else "내일 월요일..."
        in listOf("월", "화") -> "버티자"
        in 2..4 -> "숫자의 경우, 범위 값으로 사용 가능"
        else -> false
    }

    println(result)
}

