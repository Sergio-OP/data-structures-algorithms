package t02CodingProblems

fun main() {
    val arrayOne = arrayOf('a', 'b', 'c', 'x')
    val arrayTwo = arrayOf('z', 'y', 'i')
    println(arraysContainsCommonItems(arrayOne, arrayTwo))

    val array2 = arrayOf('z', 'y', 'x')
    println(arraysContainsCommonItems(arrayOne, array2))
}

fun arraysContainsCommonItems(arrayOne: Array<Char>, arrayTwo: Array<Char>): Boolean {
    // val shorterArray = if (arrayOne.size <= arrayTwo.size) arrayOne else arrayTwo
    arrayOne.forEach { char ->
        if (arrayTwo.contains(char)) return true
    }
    return false
}
