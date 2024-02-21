package t06QueueStack

data class Node(
    val value: String,
    var nextNode: Node? = null
)

class Queue {
    private var first: Node? = null
    private var last: Node? = null
    var length: Int = 0
        private set(value) {
            field = if (value < 0) 0 else value
        }

    fun peek(): String? = first?.value

    fun print() = println(first)
    fun enqueue(value: String): Queue {
        val newNode = Node(value)
        if (length == 0)
            first = newNode
        else
            last?.nextNode = newNode
        last = newNode
        length++
        return this
    }

    fun dequeue(): Queue {
        val tempNode = first
        first = tempNode?.nextNode
        length--
        return this
    }
}

fun main() {
    val myQueue = Queue()
    println("Length: ${myQueue.length}")

    myQueue.enqueue("Google")
    myQueue.print()
    println("Length: ${myQueue.length}")

    myQueue.enqueue("Udemy")
    myQueue.print()
    println("Length: ${myQueue.length}")

    myQueue.enqueue("Discord")
    myQueue.print()
    println("Length: ${myQueue.length}")
    println(myQueue.peek())

    myQueue.dequeue()
    myQueue.print()
    println("Length: ${myQueue.length}")
    println(myQueue.peek())

    myQueue.dequeue()
    myQueue.print()
    println("Length: ${myQueue.length}")
    println(myQueue.peek())

    myQueue.dequeue()
    myQueue.print()
    println("Length: ${myQueue.length}")
    println(myQueue.peek())

    myQueue.dequeue()
    myQueue.print()
    println("Length: ${myQueue.length}")

    myQueue.dequeue()
    myQueue.print()
    println("Length: ${myQueue.length}")

    myQueue.enqueue("Google")
    myQueue.print()
    println("Length: ${myQueue.length}")

    myQueue.enqueue("Udemy")
    myQueue.print()
    println("Length: ${myQueue.length}")

    myQueue.enqueue("Discord")
    myQueue.print()
    println("Length: ${myQueue.length}")
}