package Algorithms03DynamicProgramming

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */


fun climbStairs(n: Int): Int {

    // Base case
    if (n == 0) // We achieved last stair
        return 1
    if (n < 0) { // We have done over climbing
        return 0
    }

    return climbStairs(n-1) + climbStairs(n-2)
}

fun main() {
    val n = 5
    println("Climbing a $n height staircase: ${ climbStairs(n) } different ways to climb to the top")
}