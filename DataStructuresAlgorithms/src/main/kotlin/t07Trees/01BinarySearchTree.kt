package t07Trees

class BinarySearchTree {
    private var root: Node? = null

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
}