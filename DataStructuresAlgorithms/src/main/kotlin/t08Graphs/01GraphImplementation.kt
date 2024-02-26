package t08Graphs

class Graph {
    private var numberOfNodes = 0
    private val adjacentList: MutableMap<Int, MutableList<Int>> = mutableMapOf()

    fun addVertex(node: Int) {
        if (adjacentList.containsKey(node)) return
        adjacentList[node] = mutableListOf()
        numberOfNodes++
    }

    fun addEdge(nodeOne: Int, nodeTwo: Int) {
        if(adjacentList.containsKey(nodeOne) && adjacentList.containsKey(nodeTwo)) {
            adjacentList[nodeOne]?.add(nodeTwo)
            adjacentList[nodeTwo]?.add(nodeOne)
        }
    }
}

fun main() {
    val myGraph = Graph()
    myGraph.addVertex(0)
    myGraph.addVertex(1)
    myGraph.addVertex(2)
    myGraph.addVertex(3)
    myGraph.addVertex(4)
    myGraph.addVertex(5)
    myGraph.addVertex(6)
    myGraph.addEdge(3,1)
    myGraph.addEdge(3,4)
    myGraph.addEdge(4,2)
    myGraph.addEdge(4,5)
    myGraph.addEdge(1,2)
    myGraph.addEdge(1,0)
    myGraph.addEdge(0,2)
    myGraph.addEdge(6,5)
}