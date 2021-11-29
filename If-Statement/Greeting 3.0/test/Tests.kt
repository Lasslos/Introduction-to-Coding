import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        testGreet("Mr. Treber")
        testGreet("Hannah")
    }
    private fun testGreet(name: String) {
        val expected = "Hello, $name! How are you?"
        val got = greet(name)
        Assert.assertTrue("Expected: $expected, Got: $got", expected == got)
    }
}