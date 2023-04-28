fun functionA(numberA: Int, numberB: Int): Int {
  return numberA + numberB
}

fun functionB(numberA: Int, numberB: Int): Int = numberA + numberB

fun functionC(numberA: Int, numberB: Int) = numberA + numberB

// Default values:
fun functionC(numberA: Int = 0, numberB: Int= 0, message: String = "This is a message: ") {
  println(message)
  val results = numberA + numberB
  return results
}

functionC(1, 23)
functionC(1, 23, "This is another message")

// Named arguments:
functionC(numberA = 1, message = "This is another named argumented message")
