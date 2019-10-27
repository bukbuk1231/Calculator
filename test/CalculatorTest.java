import calculator.Calculator;
import org.junit.Test;

import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class CalculatorTest {

    Calculator calculator;

    public CalculatorTest() {
        calculator = new Calculator();
    }

    @Test
    public void inputTestValidDoubleWithoutDecimal() {
        double n = calculator.inputNumber();
        assertEquals(n, 1.0);
    }

    @Test
    public void inputTestValidDoubleWithDecimal() {
        double n = calculator.inputNumber();
        assertEquals(n, 1.823);
    }

    @Test (expected = NumberFormatException.class)
    public void inputTestInvalidString() {
        double n = calculator.inputNumber();
    }

    @Test
    public void operatorTestWithValidChoice() {
        char op = calculator.chooseOperator("2");
        assertEquals(op, '-');
    }

    @Test (expected = NoSuchElementException.class)
    public void operatorTestWithInvalidChoice() {
        char op = calculator.chooseOperator("8");
    }

    @Test (expected = NumberFormatException.class)
    public void operatorTestWithInvalidInput() {
        char op = calculator.chooseOperator("adsa");
    }
}
