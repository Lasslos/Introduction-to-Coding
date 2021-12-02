import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        testGreet("Mr. Treber")
        testGreet("Hannah")
    }
    private fun testGreet(name: String) {
        val expected = if (name == "Mr. Treber") "Good morning sir!" else "Hello there!"
        val got = greet(name)
        println("Expected: $expected, Got: $got")
        Assert.assertTrue("Expected: $expected, Got: $got", expected == got)
    }
}