package t01BigO

fun main() {
    val array = arrayOf(1,2,3,4,5)
    val array2 = arrayOf(6,7,8,9,10)
    printAllPairsOfArray(array)
}

private fun printAllPairsOfArray(array: Array<Int>) {
    array.forEach { number -> // O(n)
        array.forEach {innerNumber -> // O(n*n)
            println("$number - $innerNumber") // O(n*n)
        }
    }
}
// Big O = O(n^2) ->

private fun printTwoArrays(arrayOne: Array<Int>, arrayTwo: Array<Int>) {
    arrayOne.forEach { // O(n)
        println(it) // O(n)
    }
    arrayTwo.forEach {// O(m)
        println(it) // O(m)
    }
}
// Big O = O(n+m)