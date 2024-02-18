package t03Arrays

fun main() {
    val array = arrayOf('a', 'b', 'c', 'd')

    array.plus('e')
    array.slice(0..2)

    for (char in array) {
        print("[$char] ")
    }
}