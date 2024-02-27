package Algorithms01Recursion

private fun reverseString(string: String): String {
    var reversedWord = ""
    for(index in string.indices) {
        reversedWord += string[string.length-1-index]
    }
    return reversedWord
}

private fun reverseStringRecursive(string: String): String {
    return if (string.isEmpty()) {
        ""
    } else {
        reverseString(string.substring(1)) + string[0]
    }
}

fun main() {
    val word = "yoyo master"
    println("Reverse word $word iteratively: ${reverseString(word)}")
    println("Reverse word $word recursively: ${reverseStringRecursive(word)}")
}

/*
function reverseStringRecursive(str) {
  if (str === "") {
    return "";
  } else {
    return reverseStringRecursive(str.substr(1)) + str.charAt(0);
  }
}
 */