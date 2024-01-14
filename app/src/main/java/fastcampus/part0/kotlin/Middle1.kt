package fastcampus.part0.kotlin

fun main() {
    // 1. 람다
    // 익명 함수 (일회용 함수)
    // 변수처럼 사용할 수 있다. (함수의 argument, return으로 사용)
    val a = fun() { println("hi") }
    val b: (Int) -> Int = { it * 10 } // (input) -> return = { 함수 구현부 }
    val c = { i: Int, j: Int -> i * j } // { input -> 함수 구현부 }
    val d: (Int, String, Boolean) -> String = { _, string, _ -> string } // _ : 미사용 파라미터

    a()
    println(b(10))
    println(c(2, 5))
    println(d(3, "three", true))

    hello(10, b)
    println(hello2(20, b))
}

// 1-1. 함수의 argument로 사용
fun hello(n: Int, m: (Int) -> Int) {
    print("$n ")
    println(m(20))
}

// 1-2. 함수의 return으로 사용
fun hello2(n: Int, m: (Int) -> Int): (Int) -> Int {
    print("$n ")
    println(m(30))
    return m
}