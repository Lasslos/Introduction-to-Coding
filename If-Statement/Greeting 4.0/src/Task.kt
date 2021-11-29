fun main() {
    println("What is your name?")
    val name = readLine()
    if (name == "Mr. Treber" || name == "Mr. Dolgopol") {
        println("Good morning sir!")
    } else if (name == "Alexa" || name == "Siri") {
        print("Hello")
        println(name)
    } else if (name == "Google Assistant") {
        println("Hey Google")
    } else {
        println("Hello World!")
    }
}