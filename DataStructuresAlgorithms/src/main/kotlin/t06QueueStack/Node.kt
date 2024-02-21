package t06QueueStack

data class Node(
    val value: String,
    var nextNode: Node? = null
)