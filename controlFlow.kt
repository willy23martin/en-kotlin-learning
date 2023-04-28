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

/**
Loops:
*/

while(currentLibraryStock < 23) {
  currentLibraryStock += 1
}

do {
  currentLibraryStock -= 1
} while(currentLibraryStock > 1)

for(year in 2023.. 2033){
  println("Best years counting $year")
}

for(number in 23.rangeTo(44).step(5)){
  println("${++number}")
}

for(character in "String"){
  print(character)
}

for((index, item) in 23.rangeTo(44).step(5).withIndex()){
  print("${index} - $item")
}
println()

val yearSuffix = arrayOf(23, 33, 43, 53)
for(yearSuffixIndex in yearSuffix.indices){
  println("$yearSuffixIndex - ${yearSuffix[yearSuffixIndex]}")
}
