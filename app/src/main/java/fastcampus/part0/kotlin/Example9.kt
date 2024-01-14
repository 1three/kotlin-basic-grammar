package fastcampus.part0.kotlin

fun main() {
    // 9-1. 타입 체크 : is
    println(checkType("Hi"))
    println(checkType(3))
    println(checkType(true))

    // 9-2. 캐스팅 (형 변환) : as
    cast("안녕")
    // cast(10) // ClassCastException (Int → 불가 → String)

    println(smartCast("안녕"))
    println(smartCast(10))
    println(smartCast(true))
}

fun checkType(n: Any): String {
    return when (n) {
        is String -> "문자열"
        is Int -> "정수"
        else -> "몰라"
    }
}

fun cast(m: Any) {
    // as? Type : Type으로 변환 불가 시, 자동 null 반환
    // val result = m as? String
    // val result = (m as? String) ?: "실패"
    val result = m as String

    println(result)
}

fun smartCast(l: Any): Int {
    return when (l) {
        is String -> l.length
        is Int -> l.dec() // dec = -1
        else -> -1
    }
}