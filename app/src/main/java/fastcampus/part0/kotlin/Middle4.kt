package fastcampus.part0.kotlin

// 4. 초기화 지연 (lateinit, lazy)
// 변수 선언 시 값을 지정하지 않고, 나중에 지정하 사용
// 특징 : 효율적인 메모리 사용, null safe 사용

// 4-1. lateinit var(변수 타입 지정 필수, 선언 후 사중에 초기화 가능)
lateinit var text: String

// 원시 타입 (primitive type) 불가 : boolean, 정수, 실수, 문자
// lateinit var age: Int

// 4-2. lazy val (선언과 동시에 초기화 필수, 호출 시점에 이뤄지는 초기화)
val test: Int by lazy {
    println("초기화 중")
    100
}

fun main() {
    text = "name"
    println(text)

    println("메인 함수 실행")
    println("첫 번째 호출 $test") // 첫 호출 시, 초기화
    println("두 번째 호출 $test") // ∴ "초기화 중" 생략
}