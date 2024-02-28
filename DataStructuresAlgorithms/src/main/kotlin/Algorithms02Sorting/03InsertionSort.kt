package Algorithms02Sorting

private fun insertionSort(array: Array<Int>): Array<Int> { // Time complexity O(n^2) & Space complexity O(1)
    val length = array.size
    for (i in 0..<length) {
        for (j in i.downTo(1)) {
            if (array[j] < array[j-1]) {
                val auxValue = array[j]
                array[j] = array[j-1]
                array[j-1] = auxValue
            } else {
                continue
            }
        }
    }
    return array
}

fun main() {
    val numbers = arrayOf(99,44,6,2,1,5,63,87,283,4,0)
    println("Unsorted array: ${numbers.contentToString()}")
    println("Sorted array: ${insertionSort(numbers).contentToString()}")
}