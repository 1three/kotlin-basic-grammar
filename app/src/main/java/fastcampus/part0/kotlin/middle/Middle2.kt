package fastcampus.part0.kotlin.middle

fun main() {
    // 2. 확장함수 (기존 정의 클래스에 함수를 추가하는 기능)
    Test().hello()
    Test().bye()

    val test = Test()
    test.thank()
}

// Test 클래스에 thank라는 함수를 추가하는 것과 동일한 형태
fun Test.thank() = println("thank u")

class Test() {
    fun hello() = println("hi")
    fun bye() = println("bye")
}