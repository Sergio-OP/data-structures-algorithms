package t07Trees


class BinarySearchTree {
    var root: Node? = null

    fun insert(value: Int) {
        val newNode = Node(value)
        if (root == null) {
            root = newNode
            return
        }
        var auxNode = root as Node
        while (true) {
            if (value < auxNode.value) {
                if (auxNode.left == null) {
                    auxNode.left = newNode
                    break
                } else {
                    auxNode = auxNode.left!!
                }
            } else {
                if (auxNode.right == null) {
                    auxNode.right = newNode
                    break
                } else {
                    auxNode = auxNode.right!!
                }
            }
        }
    }
    fun lookup(value: Int): Node? {
        var tempNode: Node? = root ?: return null
        while (true) {
            if (tempNode == null) {
                return null
            } else if (tempNode.value == value) {
                return tempNode
            } else {
                tempNode = if (value < tempNode.value) tempNode.left else tempNode.right
            }
        }
    }

    fun breadthBinarySearch(): IntArray? {
        if (root == null) return null
        var currentNode = root as Node
        val result: MutableList<Int> = mutableListOf()
        val queue: MutableList<Node> = mutableListOf()

        queue.add(currentNode)

        while (queue.isNotEmpty()) {
            currentNode = queue.removeFirst()
            result.add(currentNode.value)

            if (currentNode.left != null)
                queue.add(currentNode.left!!)

            if (currentNode.right != null)
                queue.add(currentNode.right!!)
        }

        return result.toIntArray()
    }

    fun breadthBinarySearchRecursive(queue: MutableList<Node>, list: MutableList<Int>): MutableList<Int> {
        if (queue.isEmpty())
            return list

        val currentNode = queue.removeFirst()
        list.add(currentNode.value)

        if (currentNode.left != null)
            queue.add(currentNode.left!!)

        if (currentNode.right != null)
            queue.add(currentNode.right!!)

        return breadthBinarySearchRecursive(
            queue = queue,
            list = list
        )

    }

    fun deepFirstSearchInOrder() = dfsInOrder(root!!, mutableListOf())
}

fun dfsInOrder(node: Node, list: MutableList<Int>): MutableList<Int> {
    if(node.left != null) {
        dfsInOrder(node.left!!, list)
    }
    list.add(node.value)
    if(node.right != null) {
        dfsInOrder(node.right!!, list)
    }
    return list
}


fun main() {
    val myBinarySearchTree = BinarySearchTree()
    myBinarySearchTree.insert(9)
    myBinarySearchTree.insert(4)
    myBinarySearchTree.insert(6)
    myBinarySearchTree.insert(20)
    myBinarySearchTree.insert(170)
    myBinarySearchTree.insert(15)
    myBinarySearchTree.insert(1)
    var node = myBinarySearchTree.lookup(1)
    node = myBinarySearchTree.lookup(15)
    node = myBinarySearchTree.lookup(20)
    node = myBinarySearchTree.lookup(123)

    println("Breadth First Search BFS iterative implementation: ")
    println(myBinarySearchTree.breadthBinarySearch().contentToString())
    println()
    println("Breadth First Search BFS recursive implementation: ")
    println(myBinarySearchTree
        .breadthBinarySearchRecursive(
            mutableListOf(myBinarySearchTree.root!!), mutableListOf()
        )
    )
    println()
    println("Deep First Search DFS recursive IN ORDER implementation: ")
    println(myBinarySearchTree.deepFirstSearchInOrder())
}