package Algorithms01Recursion

private fun findFactorialIterative(number: Int): Int {
    var result = 1
    for (element in number.downTo(2)) {
        result *= element
    }
    return result
}

private fun findFactorialRecursive(number: Int): Int {
    if(number < 2) return 1
    return number * findFactorialRecursive(number-1)
}

fun main() {
    println("Factorial Iterative 6! = ${findFactorialIterative(6)}")
    println("Factorial Recursive 6! = ${findFactorialRecursive(6)}")
}