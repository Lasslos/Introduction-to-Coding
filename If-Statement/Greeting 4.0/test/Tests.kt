import org.junit.Assert
import org.junit.Test
import kotlin.math.exp

class Test {
    @Test fun testSolution() {
        testGreet("Mr. Treber")
        testGreet("Mr. Dolgopol")
        testGreet("Joe")
        testGreet("Google Assistant")
        testGreet("Brayden")
        testGreet("Weidel")
    }

    fun testGreet(name: String) {
        val expected = if (name == "Mr. Treber" || name == "Mr. Dolgopol") {
            "Good morning sir!"
        } else if (name == "Joe") {
            "Mama!"
        } else if (name == "Google Assistant") {
            "Hey Google!"
        } else {
            "Hello there!"
        }
        val got = greet(name)
        println("Expected: $expected, Got: $got")
        Assert.assertTrue("Expected: $expected, Got: $got", expected == got)
    }
}