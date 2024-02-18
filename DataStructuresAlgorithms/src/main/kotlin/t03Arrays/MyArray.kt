package t03Arrays

fun main() {
    val dynamicArray = MyArray()
    dynamicArray.push("Apple")
    dynamicArray.push("Ball")
    dynamicArray.push("Cat")
    dynamicArray.push("Dog")

    println("Array length: ${dynamicArray.length}")
    println("Array content: ${dynamicArray.array().contentToString()}")
    println("Item at index 2: ${dynamicArray.get(2)}")

    dynamicArray.replace(1, "World")
    println("Array content: ${dynamicArray.array().contentToString()}")

    dynamicArray.pop()
    println("Array content: ${dynamicArray.array().contentToString()}")

    dynamicArray.delete(1)
    println("Array content: ${dynamicArray.array().contentToString()}")

    println("Array length: ${dynamicArray.length}")
}

class MyArray(
    var length: Int = 0,
    private var data: Array<String?> = arrayOfNulls(1),
    private var capacity: Int = 1,
) {
    fun get(index: Int): String? {
        return if(index > -1 && index <length) data[index] else "IndexOutOfBounds"
    }

    fun push(item: String) {
        if(length == capacity) {
            val tempArray = arrayOfNulls<String>(2*capacity)
            for (i in data.indices) {
                tempArray[i] = data[i]
            }
            data = tempArray
            capacity *= 2
        }
        data[length] = item
        length++
    }

    fun replace(index: Int, element: String) {
        if(index > -1 && index < length) {
            data[index] = element
        } else {
            println("IndexOutOfBounds")
        }
    }

    fun pop() {
        if(length > 0) {
            length--
        }
    }

    fun delete(index: Int) {
        if(index > -1 && index < length) {
            if(index == length-1) {
                pop()
            } else {
                for (i in index..<length) {
                    data[i] = data[i+1]
                }
                length--
            }
        } else {
            println("IndexOutOfBounds")
        }
    }

    fun array(): Array<String?> {
        val tempArray = arrayOfNulls<String>(length)
        for (i in 0..<length) {
            tempArray[i] = data[i]
        }
        return tempArray
    }
}