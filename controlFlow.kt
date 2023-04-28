/**
Conditionals:
*/

// Oneline
val condition = if (3 < 45) 34 else 23
println("The result is $condition")

// Multiline clauses
val conditionB = if (3 < 45) {
  34
} else {
  23
}
println("The result is $conditionB")

// When
val currentLibraryStock = 23
when(currentLibraryStock){
  0 -> println("We are out of stock!")
  1, 2 -> println("We are almost out of stock")
  in 3..5 -> println("Request for new books or restore the booked ones")
  23 -> println("We are full of stock!")
  else -> println("We are ok with our stock")
}

when {
  currentLibraryStock < 1 -> println("We are out of stock!")
  currentLibraryStock == 23 -> println("We are full of stock!")
  else -> println("We are ok with our stock")
}

