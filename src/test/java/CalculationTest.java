import org.junit.Test;

public class CalculationTest {

    @Test
    public void calcTest() {
        Calculator calculator = new Calculator();
        int result = calculator.hardCalculation(50, 50, 90);
        System.out.println(result);
    }
}
