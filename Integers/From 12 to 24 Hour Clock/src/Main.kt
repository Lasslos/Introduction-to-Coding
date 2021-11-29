fun main() {
    println("What hour is it?")
    val hour = readLine()!!.toInt()
    if (hour < 0 || hour > 12) {
        println("This is not a valid input!")
        return
    }
    println("Is it AM or PM?")
    val amOrPM = readLine()
    if (amOrPM != "AM" && amOrPM != "PM") {
        println("This is not a valid input!")
        return
    }
    print("In 24-Hour Clock, that is ")
    if (amOrPM == "AM") {
        print(hour)
    } else {
        print(hour + 12)
    }
}
