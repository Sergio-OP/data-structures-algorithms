package t06QueueStack

class QueueImplementation {
    private var front: Node? = null
    private var rear: Node? = null
    var length: Int = 0
        private set(value) {
            field = if (value<0) 0 else value
        }

    fun enqueue(element: String) {
        val tempNode = Node(value = element)
        if (rear == null) {
            front = tempNode
            rear = tempNode
            return
        }
        rear?.nextNode = tempNode
        rear = tempNode
    }

    fun dequeue(): String? {
        if(rear == front) {
            front = null
            rear = null
            return null
        }
        val dataDequeued = front?.value
        front = front?.nextNode
        length--
        return dataDequeued
    }

    fun peek(): String? = front?.value
}

fun main() {
    val myQueue = QueueImplementation()
    myQueue.enqueue("Sergio")
    myQueue.enqueue("Karen")
    myQueue.enqueue("Monica")
    myQueue.dequeue()
    myQueue.dequeue()
    myQueue.dequeue()
    println(myQueue.peek())
}