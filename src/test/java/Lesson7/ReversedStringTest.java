package Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ReversedStringTest {
    @ParameterizedTest
    @CsvSource(value = {"test:tset", "kot:tok", "Marcin:nicraM"}, delimiter = ':')
    void shouldVerifyReverseString(String input, String expected) {
        String result = ReversedString.reverseString(input);
        Assertions.assertEquals(expected, result);
    }
}

