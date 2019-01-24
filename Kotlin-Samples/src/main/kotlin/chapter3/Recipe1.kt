package chapter3

fun main(vararg args: String) {
  val block: () -> Unit = { println("Hello World") }
  measureTime(block)
}

fun measureTime(block: () -> Unit): Long {
  val start = System.currentTimeMillis()
  block()
  val end = System.currentTimeMillis()
  return end - start
}


