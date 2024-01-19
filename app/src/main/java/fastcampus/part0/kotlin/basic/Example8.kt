package fastcampus.part0.kotlin.basic

fun main() {
    // 8. null (Kotlin의 null 안정성)

    // 타입 선언 : null 불가 명시
    // : String
    // : Int
    var name: String = "한슬"
    // name = null // 컴파일 단계 Error

    // 타입? 선언 : null 가능 명시
    // : String?
    // : Int?
    var nickname: String? = "three"

    /*
    * Elvis Operation (?:)
    *
    * 왼쪽 값이 non-null 경우, 객체 값 리턴
    * 왼쪽 값이 null 경우, 오른쪽 값 리턴
    */

    // val result = if (nickname == null) "값 X" else nickname
    val result = nickname ?: "값 X"
    println(result)

    nickname = null
    // val nicknameLength = nickname.length // Error

    // ? : null 경우, null 반환
    // !! : null 아님이 확실할 경우
    val nicknameLength = nickname?.length

    println(nicknameLength)
}
