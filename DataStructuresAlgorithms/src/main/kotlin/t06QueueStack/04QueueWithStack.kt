package t06QueueStack

import java.util.*

class MyQueue() {
    /*
    stackOne stores back/tail/rear element of queue at the top
    stackTwo stores front/head element of queue at the top

    STACK2(TOP)--->     (0) - (1) - (2) - (3) - ... (n-1) - (n)      <---STACK1(TOP)
     */
    private var stackOne: Stack<Int> = Stack()
    private var stackTwo: Stack<Int> = Stack()

    // enqueue()
    fun push(x: Int) {
        stackOne.push(x)
    }

    // dequeue()
    fun pop(): Int {
        if(empty()) return -1

        if(stackTwo.isEmpty() && stackOne.isNotEmpty()) {
            while (stackOne.isNotEmpty()) {
                stackTwo.push(stackOne.pop())
            }
        }
        return stackTwo.pop()
    }

    fun peek(): Int {
        if(empty()) return -1

        if(stackTwo.isEmpty() && stackOne.isNotEmpty()) {
            while (stackOne.isNotEmpty()) {
                stackTwo.push(stackOne.pop())
            }
        }
        return stackTwo.peek()
    }

    fun empty(): Boolean {
        return (stackOne.isEmpty() && stackTwo.isEmpty())
    }
}