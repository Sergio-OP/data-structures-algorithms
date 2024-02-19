package t03Arrays

fun main() {
    val nums = arrayOf(1,1,1,3,3,4,3,2,4,2).toIntArray()
    println(containsDuplicate(nums))

}

fun containsDuplicate(nums: IntArray): Boolean {
    val auxiliarySet = mutableSetOf<Int>()
    nums.forEach { element ->
        if(auxiliarySet.contains(element)) return true
        auxiliarySet.add(element)
    }
    return false
}

fun containsDuplicate2(nums: IntArray): Boolean {
    val sizeList = nums.size
    val numsSet = nums.toSet()
    val sizeSet = numsSet.size
    return sizeSet < sizeList
}