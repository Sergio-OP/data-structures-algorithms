package Algorithms03DynamicProgramming

var counter = 0
var dynamicCounter = 0

private val cache: MutableMap<Int, Int> = mutableMapOf()

fun fibonacci(n: Int): Int {
    counter++
    if(n < 2)
        return n
    return fibonacci(n-1) + fibonacci(n-2)
}

fun dynamicFibonacci(n: Int): Int {
    dynamicCounter++

    if(cache.containsKey(n))
        return cache[n] as Int

    if(n < 2)
        return n

    cache[n] = dynamicFibonacci(n-1) + dynamicFibonacci(n-2)
    return cache[n] as Int
}

fun main() {
    val n = 20
    println("Fibonacci without Dynamic Programming (Cache): ${fibonacci(n)} took $counter operations")
    println()
    println("Fibonacci with Dynamic Programming (Cache): ${dynamicFibonacci(n)} took $dynamicCounter operations")
}