fun main() {
    var nullableText: String? = "Hello world"
    nullableText = null

    println(nullableText?.length ?: "Variable is null :(")
}