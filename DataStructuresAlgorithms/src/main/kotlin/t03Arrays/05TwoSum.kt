package t03Arrays

fun main() {
    val numsOne = listOf(2, 7, 11, 15).toIntArray()
    val targetOne = 9
    println(twoSum(numsOne, targetOne).contentToString())

    val numsTwo = listOf(3,2,4).toIntArray()
    val targetTwo = 6
    println(twoSum(numsTwo, targetTwo).contentToString())

    val numsThree = listOf(3,3).toIntArray()
    val targetThree = 6
    println(twoSum(numsThree, targetThree).contentToString())
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    val complementArray = arrayOfNulls<Int>(nums.size)
    nums.forEachIndexed { index, element ->
        if (complementArray.contains(element)) {
            return IntArray(2).apply {
                this[0] = complementArray.indexOf(element)
                this[1] = index
            }
        }
        complementArray[index] = target - element
    }
    return IntArray(2)
}