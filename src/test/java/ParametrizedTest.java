//import org.junit.jupiter.api.extension.*;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.*;
//
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ParametrizedTest {
//
////    @RegisterExtension
////    static final MultiplierResolver multiplierResolver = new MultiplierResolver();
//
//    @ParameterizedTest
//    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
//    public void testSum(int x) {
//        System.out.println("PARAMETER x IS: " + x);
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(x, 1);
//        assertEquals(3, result);
//    }
//
//    @ParameterizedTest
//    @NullAndEmptySource
//    public void testSum1(String str) {
//        assertTrue(str.isBlank());
//    }
//
//    @ParameterizedTest
//    @CsvSource({"1, 1, 2"})
//    @CsvFileSource
//    public void testSumCsv(int number) {
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(number, number);
//        assertEquals(number*2, result);
//    }
//
//    @ParameterizedTest(name = "Test round: {index} | sum {0} with {1}. Expecting {2}")
//    @MethodSource("numbersForCalculator")
//    public void testSumMethod(int firstNumber, int secondNumber, int expectedResult) {
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(firstNumber, secondNumber);
//        assertEquals(expectedResult, result);
//    }
//
////    @ParameterizedTest
////    @MethodSource("numberWithMultiplier")
////    public void testSumMethodWithParam(int firstNumber) {
////        Calculator calculator = new Calculator();
////        int result = calculator.sum(firstNumber, firstNumber);
////        assertEquals(firstNumber * 2, result);
////    }
//
//    public static Stream<Arguments> numbersForCalculator() {
//        return Stream.of(
//            Arguments.arguments(1, 2, 3),
//            Arguments.arguments(2, 2, 4),
//            Arguments.arguments(5, 5, 10)
//        );
//    }
//
////    public static Stream<Arguments> numberWithMultiplier(int multiplier) {
////        return Stream.of(
////                Arguments.arguments(1),
////                Arguments.arguments(2),
////                Arguments.arguments(5)
////        );
////    }
//
//
//
////    static class MultiplierResolver implements ParameterResolver {
////
////        @Override
////        public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
////            return parameterContext.getParameter().getType() == int.class;
////        }
////
////        @Override
////        public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
////            return 2;
////        }
////    }

//Не забыть отладить расширение
//}
