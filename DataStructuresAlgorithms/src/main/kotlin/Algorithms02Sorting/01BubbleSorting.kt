package Algorithms02Sorting

private fun bubbleSort(array: Array<Int>): Array<Int> { // O(n^2)
    val length = array.size
    for (i in 0..<(length-1)) {
        for (j in 0..<(length - 1 - i)) {
            val actualNumber = array[j]
            val nextNumber = array[j + 1]
            if (actualNumber > nextNumber) {
                array[j] = nextNumber
                array[j + 1] = actualNumber
            }
        }
    }
    return array
}

fun main() {
    val numbers = arrayOf(99,44,6,2,1,5,63,87,283,4,0)
    println("Unsorted array: ${numbers.contentToString()}")
    println("Sorted array: ${bubbleSort(numbers).contentToString()}")
}