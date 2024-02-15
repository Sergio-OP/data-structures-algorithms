package t01BigO

fun main() {
    val elements = arrayOf("Nemo")
    val largeArray = Array(size = 1000){"Nemo"}
    findNemo(largeArray)
    printFirstTwoElements(largeArray)
}

private fun findNemo(elements: Array<String>) { // O(n) --> Linear time
    val initialTime = System.nanoTime() // O(1)
    for (element in elements) { // O(n)
        if (element == "Nemo") { // O(n)
            println("Found Nemo") // O(n)
            return
        }
    }
    val finalTime = System.nanoTime() // O(1)
    println("Function took ${(finalTime-initialTime)/1_000_000.0} milliseconds") // O(1)
}

private fun printFirstTwoElements(elements: Array<String>) { // O(1) -> Constant Time
    println(elements.first()) // O(1)
    println(elements.component2()) // O(1)
}