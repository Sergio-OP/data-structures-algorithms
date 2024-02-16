fun main() {
    sayHello("Sergio", 24)
    sayHello("Monica", 63)
    sayHello("Alejandro", 43)

    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some Data...")
    } else {
        showMessage()
    }
}

private fun sayHello(name: String, age: Int) {
    println("Hello $name! Your age is $age")
}

private fun getData(data: String) {
    println("Your data is: $data")
}

private fun showMessage() {
    println("There is no internet connection")
}