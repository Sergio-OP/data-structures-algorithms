package t04HashTable

fun main() {
    val array = arrayOf(2, 5, 1, 2, 3, 5, 1, 2, 4)
    println(firstRecurringCharacter(array))
}

private fun firstRecurringCharacter(array: Array<Int>): Int? {
    val map = mutableMapOf<Int, Boolean>()
    array.forEach { element ->
        if (map.get(element) == true) return element
        map.put(element, true)
    }
    return null
}