package fastcampus.part0.kotlin.basic

fun main() {
    val user = User("한슬", 24)
    user.age = 26
    // user.name : 접근 불가 (private)
    println(user.age)

    Kid("아이", 3, "male")
}

// 4. 클래스
// 4-1. () : Constructor(생성자)
// 4-2. Constructor : default value 설정 가능
class User(private val name: String, var age: Int = 24)

// 4-3. 상속 : open 키워드 사용
// Kid 생성 시, User2 상속 받고 싶을 경우
open class User2(open val name: String, open var age: Int = 24)

// 바깥 : 주 생성자
class Kid(override val name: String, override var age: Int) : User2(name, age) {
    var gender: String = "female"

    // 클래스 내 가장 먼저 호출
    init {
        // Fragment 초기화 시 사용
        println("초기화 중")
    }

    // 내부 : 부 생성자
    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
        println("부 생성자 호출")
    }
}