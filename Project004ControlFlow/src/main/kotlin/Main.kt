fun main() {
    val alarm = 6
    when (alarm) {
        12, 7, 14 -> println("The time is $alarm")
        in 1..10 -> println("The number is in the range 1..10")
        (not in 1..10) -> println("It is false")

        else -> println("The time is not $alarm")
    }
}