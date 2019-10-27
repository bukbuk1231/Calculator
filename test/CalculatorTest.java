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
        double n = calculator.inputNumber("asda");
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
    public void operatorTestWithInvalidChoice() {
        char op = calculator.chooseOperator("acsac");
    }

    @Test
    public void calculateTestWithValidEquation() {
        double n = calculator.calculate(1.2, 3.3, '+');
        assertEquals(n, 4.5);
    }

    @Test (expected = ArithmeticException.class)
    public void calculateTestWithDivisionByZero() {
        double n = calculator.calculate(1.2, 0, '/');
    }

    @Test (expected = ArithmeticException.class)
    public void calculateTestWithModByZero() {
        double n = calculator.calculate(1.2, 0, '%');
    }

    @Test
    public void calculateTestWithNegative() {
        double n = calculator.calculate(1.2, -3.0, '*');
        assertEquals(n, -3.6);
    }
}
