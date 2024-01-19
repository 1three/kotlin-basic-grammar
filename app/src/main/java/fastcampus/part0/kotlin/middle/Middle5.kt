package fastcampus.part0.kotlin.middle

// 5-1. data class : 데이터를 담기 위한 클래스
// toString, hashCode, equals, copy 메서드 자동 생성
// 1개 이상의 프로퍼티 필요 (val 변수: 타입, ...)
// abstract, open, sealed, inner 키워드 사용 불가
// 상속 불가

// 5-2. sealed class
// 추상 클래스, 상속받은 자식의 종류를 제한
// when과 사용

fun main() {
    // 5-1. data class
    val person = People("한슬", 24)
    val dog = Dog("도그", 2)

    println(person) // 주소
    println(dog)   // 데이터

    // toString()으로 인해
    // basic    : Dog(name=도그, age=2)
    // override : 이름=도그, 나이=2

    println(dog.copy(age = 3))

    // 5-2. sealed class
    val cat: Cat = BlackCat()
    val result = when (cat) {
        is BlackCat -> "black"
        is RedCat -> "red"
        is WhiteCat -> "white"
        // abstract → sealed 변경 : else 문 redundant (불필요)
        // else -> "etc"
    }
    println(result)
}

class People(
    val name: String,
    val age: Int,
)

class Whale()

data class Dog(
    val name: String,
    val age: Int
) {
    override fun toString(): String {
        return "이름=$name, 나이=$age"
    }
}

// abstract 시, 컴파일러는 Cat을 상속받은 하위 클래스를 알지 못한다.
// abstract class Cat

// sealed 시, 컴파일러는 Cat을 상속받은 하위 클래스를 알고 있다.
// 하위 클래스가 추가될 경우, 컴파일러는 해당 하위 클래스를 인지하여 추가 구현되어야 하는 부분을 알려줄 수 있다.
sealed class Cat
class BlackCat : Cat()
class RedCat : Cat()
class WhiteCat : Cat()