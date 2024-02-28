package Algorithms02Sorting

private fun selectionSort(array: Array<Int>): Array<Int> { // Time complexity O(n^2) & Space complexity O(1)
    val length = array.size
    for (i in 0..(length - 2)) {
        var minorValueIndex = i
        for (j in 0..< (length - i) ) {
            if (array[minorValueIndex] > array[j]) {
                minorValueIndex = j
            }
        }
        val auxValue = array[i]
        array[i] = array[minorValueIndex]
        array[minorValueIndex] = auxValue
    }
    return array
}

fun main() {
    val numbers = arrayOf(99,44,6,2,1,5,63,87,283,4,0)
    println("Unsorted array: ${numbers.contentToString()}")
    println("Sorted array: ${selectionSort(numbers).contentToString()}")
}