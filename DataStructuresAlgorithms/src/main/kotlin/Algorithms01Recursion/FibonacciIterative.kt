package Algorithms01Recursion

private fun fibonacciIterative(index: Int): Int { // O(n)
    var fibonacciNumber = 1
    var fibonacciPreviousNumber = 0
    if (index == 0) return 0
    for(actualIndex in 2..index) {
        val auxNumber = fibonacciNumber
        fibonacciNumber += fibonacciPreviousNumber
        fibonacciPreviousNumber = auxNumber
    }
    return fibonacciNumber
}

private fun fibonacciRecursive(index: Int): Int { // O(n^2)
    if(index == 1) return 1
    else if (index == 0) return 0
    return fibonacciRecursive(index-1) + fibonacciIterative(index-2)
}

fun main(){
    println("Fibonacci Iterative 10! = ${fibonacciIterative(15)}")
    println("Fibonacci Recursive 10! = ${fibonacciRecursive(15)}")
}