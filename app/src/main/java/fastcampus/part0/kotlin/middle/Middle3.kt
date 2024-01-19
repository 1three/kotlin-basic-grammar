package fastcampus.part0.kotlin.middle

fun main() {
    // 3. 범위 지정함수 (Scope function) : let, run, apply, also, with
    // 확장 함수
    // 객체의 컨텍스트 내에서 실행 가능한 코드 블럭을 만드는 함수

    // |     수신객체     |    확장함수로 호출   | 함수의 인자 |
    // |  this (생략 O)  |  apply   |  run  |   with   |
    // |  it   (생략 X)  |  also    |  let  |          |
    // |  return        |  수신객체  |  람다식의 마지막 행   |


    // 1. let : null 체크 시, 명시적으로 지역 변수 표현 시
    // 수신객체.let { it ->
    //     ...
    //     마지막 줄 // return
    // }
    val person = Person("김한슬", 24, true, false)
    val name = person.let {
        person.name
    }
    println(name)

    // 2. run : 객체 초기화 및 리턴 값이 있을 경우
    // 수신객체.run { this ->
    //     ...
    //     마지막 줄 // return
    // }
    val kid = Person("아이", 3, false, false)
    val kidAge = kid.run {
        age // 이름 없이 직접 접근 가능
    }
    println(kidAge)

    // 3. apply : 객체 초기화 시
    // 수신객체.apply { this ->
    //     ...
    //     마지막 줄 // return 수신객체 (자기 자신)
    // }
    val female = Person("한슬", 26, true, true)
    val femaleValue = female.apply {
        hasGlasses = false
        // return 수신객체 (자기 자신)
    }
    println(femaleValue.hasGlasses) // true → false 변경

    // 4. also : 명시적으로 수신객체를 사용하거나 로그 남길 경우
    // 수신객체.also { it ->
    //     ...
    //     마지막 줄 // return 수신객체 (자기 자신)
    // }
    val male = Person("완재", 29, false, false)
    val maleValue = male.also {
        println(it.name)
    }

    // 5. with : 객체 초기화, 람다의 리턴 값이 필요하지 않을 경우
    // with(수신객체) { this ->
    //     ...
    //     마지막 줄
    // }
    val result = with(male) {
        hasGlasses = true
        true
    }
    println(result)
}

class Person(
    val name: String,
    val age: Int,
    val gender: Boolean,
    var hasGlasses: Boolean,
)