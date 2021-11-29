import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        //TODO: implement your test here
        Assert.assertTrue("The input name is not the same as the output name!", testGreet("Joe"))
        Assert.assertTrue("The input name is not the same as the output name!", testGreet("Mr. Dolgopol"))

    }

    private fun testGreet(name: String) = name == greet(name)
}