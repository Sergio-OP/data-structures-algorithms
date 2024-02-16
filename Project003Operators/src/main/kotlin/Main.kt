fun main() {
    var x = 5
    val y = 3

    // This is an inline comment
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    /*
    This is a block comment!
     */
    var result = x + y
    result += 2
    println("Result $result")

    x = 0
    println("X = ${x++}")
    println("X = ${++x}")

    println("X = ${x--}")
    println("X = ${--x}")

    val myNumber = 100
    if (myNumber >= 150) {
        println("Greater than 150")
    } else if (myNumber >= 90) {
        println("Greater than 90")
    } else {
        println("All the conditions failed")
    }

    val isPlaying = true
    val score = 80
    if (isPlaying && score == 100) {
        println("Next level opened")
    } else {
        println("Still at the same level")
    }

    val num1 = 5
    val num2 = 4
    val text = if (num1 > 5 || num2 > 0) {
        println("Condition is true")
        "True"
    } else {
        println("Condition is false")
        "False"
    }
    println(text)
}