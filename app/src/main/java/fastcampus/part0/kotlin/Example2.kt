package fastcampus.part0.kotlin

fun main() {
    println("Hello")
    test1(1, 2)
    test1(1, 3)

    test2(1)
    test2(l = 1, n = 3)

    // 2-3. 함수 안에서 선언 값에 대해 작성 가능 (순서 무관)
    info1(id = "1three", name = "스리", nickname = "Three")
    info2("스리", "Three", "1three")
}

// 2. 함수 : fun
// 2-1. 반환 타입 : 반환 타입이 없을 경우 Unit (생략 가능)
fun test1(n: Int, m: Int) {
    println("$n, $m")
}

// 2-2. 오버로딩 필요 X : 매개변수 m의 default value 4로 설정 가능
fun test2(n: Int, m: Int = 4, l: Int = 5): Int {
    println("$n, $m, $l")
    return n + m
}

fun info1(name: String, nickname: String, id: String) {
    println("$name, $nickname, $id")
}

// 2-4. Single Expression (단일 표현식) : 함수 정의 축약
fun info2(name: String, nickname: String, id: String) = println("$name, $nickname, $id")