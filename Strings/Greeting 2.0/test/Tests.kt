import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        testGreet("Joe")
        testGreet("Mr. Dolgopol")
    }
    private fun testGreet(name: String) {
        val expected = "Hello, $name! How are you?"
        val got = greet(name)
        println("Expected: $expected, Got: $got")
        Assert.assertTrue("Expected: $expected, Got: $got", expected == got)
    }
}