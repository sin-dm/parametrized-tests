import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Junit4CalculatorTest {

    int firstNumber;

    int secondNumber;

    int expectedSum;

    public Junit4CalculatorTest(int firstNumber, int secondNumber, int expectedSum) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedSum = expectedSum;
    }

    @Parameterized.Parameters
    public static Object[][] parameters() {
        return new Object[][]{
                {1, 2, 3},
                {2, 3, 5},
                {4, 4, 8},
                {5, 5, 11}
        };
    }

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        assertEquals(expectedSum, calculator.sum(firstNumber, secondNumber));
    }

    @Test
    public void sumTestNoParams() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.sum(2, 2));
    }
}
