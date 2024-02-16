package t02CodingProblems

fun main() {
    val arrayOne = arrayOf(1,2,3,9)
    val arrayTwo = arrayOf(1,2,4,4)
    val sum = 8

    println(hasPairWithSum(arrayOne, sum))
    println(hasPairWithSum(arrayTwo, sum))

    println(hasPairWithSumBetter(arrayOne, sum))
    println(hasPairWithSumBetter(arrayTwo, sum))
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
 */
fun hasPairWithSum(array: Array<Int>, sum: Int): Boolean {
    array.forEachIndexed { index, _ ->
        for (element in (index+1)..array.size) {
            if (array[index] + element == sum) {
                return true
            }
        }
    }
    return false
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */
fun hasPairWithSumBetter(array: Array<Int>, sum: Int): Boolean {
    val set: MutableSet<Int> = mutableSetOf()
    for (number in array) {
        if(set.contains(number)) return true
        set.add(sum - number)
    }
    return false
}
