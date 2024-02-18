package t03Arrays

fun main(){
    val string = "Hello my name is Sergio"
    val reversedWord: String = reverseWord(string)
    println(reversedWord)
}

fun reverseWord(string: String): String {
    var reversedWord = ""
    for (index in (string.length-1).downTo(0)) {
        reversedWord += string[index]
    }
    return reversedWord
}
