package fastcampus.part0.kotlin

import fastcampus.part0.kotlin.Book.Companion.NAME

// 6-1. object : 클래스 정의와 동시에 객체 생성 (ex : error code)
fun main() {
    // 6-1-1. 싱글톤 (객체의 인스턴스 오직 1개 생성, 고정된 메모리 영역을 사용) 생성 용이
    println(Counter.count) // 초기화 + 0 출력
    Counter.countUp()
    Counter.countUp()
    println(Counter.count) // 2

    Counter.hello()

    // 6-2-1. 클래스명으로 바로 접근 가능
    NAME
    Book.create()
}

// 6-1-2. 생성자 사용 불가
// 6-1-4. 다른 클래스/인터페이스 상속 받기 가능
object Counter: Hello() {
    // 6-1-3. 프로퍼티, 메서드, 초기화 블록 사용 가능
    var count = 0
    init {
        println("카운터 초기화")
    }
    fun countUp() {
        count++
    }
}

open class Hello() {
    fun hello() = println("hello")
}

// 6-2. companion object (Java의 static과 동일)
// 클래스 내 오직 하나만 생성 가능
class Book {
    companion object {
        val NAME = "Three"
        fun create() = Book()
    }
}