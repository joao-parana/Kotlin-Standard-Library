package chapter9


/**
 * Chapter: Miscellaneous
 * Recipe:
 */

@JvmName("joinStringList")
fun List<String>.join(): String {
    return joinToString()
}

@JvmName("joinIntList")
fun List<Int>.join(): Int =
    fold(0) { acc, value ->
        acc + value
    }

fun main(vararg args: String) {
    println(listOf(1, 2, 3).join())
    println(listOf("a", "b", "c").join())
}
