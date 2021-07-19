import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculatorTest {
    @Test
    internal fun checkSum() {
        var obj = addFuntion()
        Assertions.assertEquals(17,obj.add(3,7))
    }
}