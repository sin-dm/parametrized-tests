//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.*;
//
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.params.provider.Arguments.arguments;
//
something {
//
//
//    @ParameterizedTest
//    @ValueSource(ints = {1, 1, 2})
//    public void sumTest(int firstNumber) {
//        Calculator calculator = new Calculator();
//        assertEquals(firstNumber+firstNumber, calculator.sum(firstNumber, firstNumber));
//    }
//
//    @ParameterizedTest
//    @CsvSource({
//            "'1',1",
//            "2,2",
//            "3,3",
//            "4,4"
//    })
//    public void sumTestCsv(int firstNumber, int secondNumber) {
//        Calculator calculator = new Calculator();
//        assertEquals(firstNumber+secondNumber, calculator.sum(firstNumber, secondNumber));
//    }
//
//    @ParameterizedTest
//    @MethodSource("numberForCalculator")
//    public void sumTestMethod(int firstNumber, int secondNumber, int expectedResult) {
//        Calculator calculator = new Calculator();
//        assertEquals(expectedResult, calculator.sum(firstNumber, secondNumber));
//    }
//
//    @Test
//    public void sumTestNoParams() {
//        Calculator calculator = new Calculator();
//        assertEquals(3, calculator.sum(1, 2));
//    }
//
//    public static Stream<Arguments> numberForCalculator() {
//        return Stream.of(
//          arguments(1, 2, 3),
//          arguments(2, 2, 4),
//          arguments(100, 300, 400),
//          arguments(1, 2, 10)
//        );
//    }
//
//
//
//}
