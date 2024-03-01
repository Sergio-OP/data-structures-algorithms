package Algorithms03DynamicProgramming

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

// cache memory
private val cache: MutableMap<Int, Int> = mutableMapOf()

fun climbStairs(n: Int): Int {
    if(cache.containsKey(n))
        return cache[n]!!

    // Base case
    if (n == 0) // We achieved last stair
        return 1
    if (n < 0) { // We have done over climbing
        cache[n] = 0
        return 0
    }

    cache[n] = climbStairs(n-1) + climbStairs(n-2)
    return cache[n]!!
}

fun main() {
    val n = 5
    println("Climbing a $n height staircase: ${ climbStairs(n) } different ways to climb to the top")
}