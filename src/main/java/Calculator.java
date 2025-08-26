public class Calculator {

    int multiplier = 2;

    public int sum(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        return a - b;
    }

    public int hardCalculation(int a, int b, int c) {
        if (a > 0 && a < 100) {
            return a + b + c;
        } else if (a < 0 && b < 0) {
            return a * 3;
        } else if (c < 0 && b > 0) {
            return c * 2;
        } else {
            return a * 2 + b * 2 + c * 2 * multiplier;
        }
    }
}
