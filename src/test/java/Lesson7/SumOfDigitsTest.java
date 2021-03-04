package Lesson7;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class SumOfDigitsTest {

    @ParameterizedTest
    @CsvSource(value = {"12:3", "123:6", "12:3"}, delimiter = ':')
    void ShouldVerifyAddDigits(String input, String expected) {
        // given, when

        String sum = SumOfDigits.addDigits(input);

        // then
        Assertions.assertEquals(expected, sum);


    }
}