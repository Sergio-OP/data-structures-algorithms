package Algorithms02Sorting

fun mergeSort(array: IntArray): IntArray {
    if (array.size == 1)
        return array
    // Split array into right and left
    val left = array.slice(0..<(array.size/2)).toIntArray()
    val right = array.slice((array.size/2)..<array.size).toIntArray()

    return merge(
        mergeSort(left),
        mergeSort(right)
    )
}

fun merge(left: IntArray, right: IntArray): IntArray {
    val result = IntArray(size = left.size + right.size)

    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
        if (left[i] < right[j]) {
            result[k] = left[i]
            i++
        } else {
            result[k] = right[j]
            j++
        }
        k++
    }

    while (i < left.size) {
        result[k] = left[i]
        i++
        k++
    }

    while (j < right.size) {
        result[k] = right[j]
        j++
        k++
    }

    return result
}


fun main() {
    val numbers = intArrayOf(99,44,6,2,1,5,63,87,283,4,0)
    println("Unsorted array: ${numbers.contentToString()}")
    println("Sorted array: ${mergeSort(numbers).contentToString()}")
}