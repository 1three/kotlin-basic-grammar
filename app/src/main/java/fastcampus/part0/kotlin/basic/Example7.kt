package fastcampus.part0.kotlin.basic

fun main() {
    // 7-1. list
    // mutableList : 추가, 삭제 등 변경 가능
    // list : 변경 불가

    val list = mutableListOf(1, 2, 3, 4, 5)
    list.add(6)
    list.addAll(listOf(7, 8, 9))

    val list2 = listOf(1, 2, 3, 4)
    // list2.add // Error

    println(list)
    println(list2.joinToString(" ")) // it 사용

    // 특징 1 : 다양한 타입 저장
    val diverseList = listOf(1, "hi", 3.14, true)

    // 특징 2 : 강력한 확장 함수
    // first, map 등

    // 7-2. map
    val map = mapOf((1 to "안녕"), (2 to "Hello"))
    // map.put // Error

    val map2 = mutableMapOf((1 to "안녕"), (2 to "Hello"))
    // map2.put(3, "Bonjour")
    map2[3] = "Bonjour" // Index Operator
}

