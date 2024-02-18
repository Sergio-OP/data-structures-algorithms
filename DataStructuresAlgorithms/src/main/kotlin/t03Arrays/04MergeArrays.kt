package t03Arrays

fun main() {
    val arrayOne = arrayOf(0, 3, 4, 31)
    val arrayTwo = arrayOf(4, 6, 30)
    val mergedArray: Array<Int> = mergeSortedArrays(arrayOne, arrayTwo)
    println(mergedArray.contentToString())
}

fun mergeSortedArrays(arrayOne: Array<Int>, arrayTwo: Array<Int>): Array<Int> {
    val finalSize = arrayOne.size + arrayTwo.size
    val mergedArray = Array(finalSize) {0}
    var auxiliaryOne = 0
    var auxiliaryTwo = 0
    var auxiliaryPrincipal = 0

    while (auxiliaryOne < arrayOne.size && auxiliaryTwo < arrayTwo.size) {
        if (arrayOne[auxiliaryOne] < arrayTwo[auxiliaryTwo]) {
            mergedArray[auxiliaryPrincipal] = arrayOne[auxiliaryOne]
            auxiliaryOne++
        } else {
            mergedArray[auxiliaryPrincipal] = arrayTwo[auxiliaryTwo]
            auxiliaryTwo++
        }
        auxiliaryPrincipal++
    }

    if (auxiliaryOne < (arrayOne.size)) {
        for (index in auxiliaryOne..<arrayOne.size) {
            mergedArray[auxiliaryPrincipal] = arrayOne[auxiliaryOne]
            auxiliaryOne++
            auxiliaryPrincipal++
        }
    }

    if (auxiliaryTwo < (arrayTwo.size)) {
        for (index in auxiliaryTwo..<arrayTwo.size) {
            mergedArray[auxiliaryPrincipal] = arrayTwo[auxiliaryTwo]
            auxiliaryTwo++
            auxiliaryPrincipal++
        }
    }

    return mergedArray
}
