fun greet(name: String): String {
    if (name == "Mr. Treber" || name == "Mr. Dolgopol") {
        return "Good morning sir!"
    } else if (name == "Joe") {
        return "Mama!"
    } else if (name == "Google Assistant") {
        return "Hey Google!"
    } else {
        return "Hello there!"
    }
}