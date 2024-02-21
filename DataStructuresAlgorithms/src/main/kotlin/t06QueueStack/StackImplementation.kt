package t06QueueStack

class StackImplementation {
    private var head: Node? = null
    var length: Int = 0
        private set(value) {
            field = if (value < 0) 0 else value
        }

    fun peek(): String? = head?.value

    fun push(value: String){
        if(head == null) {
            head = Node(value)
        } else {
            val newNode = Node(value)
            newNode.nextNode = head
            head = newNode
        }
        length++
    }

    fun pop(): String? {
        val valuePopped = head?.value
        head = head?.nextNode
        length--
        return valuePopped
    }

}

fun main() {
    val myStack = StackImplementation()
    myStack.push("Google")
    myStack.push("Udemy")
    myStack.push("Discord")
    myStack.pop()
    myStack.pop()
    myStack.pop()
    println(myStack.peek())
}

