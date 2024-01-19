package fastcampus.part0.kotlin.basic

fun main() {
    // 6-1. for

    // 1..10 == IntRange(1, 10) == 1 until 11
    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in IntRange(1, 10)) {
        print("$i ")
    }
    println()

    for(i in 1 until 11) {
        print("$i ")
    }
    println()

    for(i in 10 downTo 1) {
        print("$i ")
    }
    println()

    for(i in 1..10 step 2) {
        print("$i ")
    }
    println()

    for(i in 10 downTo 1 step 2) {
        print("$i ")
    }
    println()

    // 6-2. while
    var j = 1

    while(j < 11) {
        print("$j ")
        j++
    }
}

