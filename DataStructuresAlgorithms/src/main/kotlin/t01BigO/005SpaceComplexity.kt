package t01BigO

fun main() {
    val numbers = listOf(1,2,3,4,5)
    boooo(numbers)
    arrayOfHiNTimes(5)
}

// This function doesn't create new variables or data structures, so Space Complexity Big O = O(1)
private fun boooo(numbers: List<Int>) { // O(1)
    for(number in numbers) {
        println(number)
    }
}

// This function creates a list (data structure) and adds n new elements, so Space Complexity = O(n)
private fun arrayOfHiNTimes(n: Int): List<String> {
    val list: MutableList<String> = mutableListOf() // O(1)
    for(index in 1..n) {
        list.add("hello") // O(n)
    }
    println(list)
    return list
}