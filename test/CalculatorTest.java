import calculator.Calculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class CalculatorTest {

    Calculator calculator;

    public CalculatorTest() {
        calculator = new Calculator();
    }

    @Test
    public void inputTestValidDoubleWithoutDecimal() {
        double n = calculator.inputNumber("1");
        assertEquals(n, 1.0);
    }

    @Test
    public void inputTestValidDoubleWithDecimal() {
        double n = calculator.inputNumber("1.823");
        assertEquals(n, 1.823);
    }

    @Test (expected = NumberFormatException.class)
    public void inputTestInvalidString() {
        double n = calculator.inputNumber("abvc");
    }
}
