import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {

    @Test
    void shouldAddTwoValues1and1() {
        //given
        int value1 = 1;
        int value2 = 1;

        //when
        int add = Calculator.add(value1, value2);

        //then
        Assertions.assertEquals(2, add);
    }

    @Test
    void shouldSubstractTwoValues1and1() {
        //given
        int value1 = 1;
        int value2 = 1;

        //when
        int substract = Calculator.substract(value1, value2);

        //then
        Assertions.assertEquals(0, substract);
    }

    @Test
    void shouldMultiplyTwoValues10and12() {
        //given
        int value1 = 10;
        int value2 = 12;

        //when
        int multiply = Calculator.multiply(value1, value2);

        //then
        Assertions.assertEquals(120, multiply);
    }

    @Test
    void shouldDivideTwoValues100and4() {
        //given
        int value1 = 100;
        int value2 = 4;

        //when
        int divide = Calculator.divide(value1, value2);

        //then
        Assertions.assertEquals(25, divide);
    }
}

