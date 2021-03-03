package Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class UpperCaseTest {
    @ParameterizedTest
    @ValueSource(strings = {"Text", "Text example", "test"})
    void shouldVerifyToUppercase(String input) {
        // given, when
        String output = UpperCase.toUpperCase(input);
        //then
        Assertions.assertEquals(output, input.toUpperCase());
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowIllegalArgumentException(String input) {
        // given, when
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            UpperCase.toUpperCase(input);
        });

        //then
        String expectedMessage = "textInput can not be null or empty String";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));


    }
}




