package Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringLengthTest {
    @ParameterizedTest
    @MethodSource("provideStringsForStringLength")
    void shouldReturnStringLength(String textInput, int length) {
        Assertions.assertEquals(length, StringLength.stringLength(textInput));
    }

    private static Stream<Arguments> provideStringsForStringLength() {
        return Stream.of(
                Arguments.of("String", 6),
                Arguments.of("Strings", 7),
                Arguments.of("TestString", 10),
                Arguments.of("StringToTest", 12)
        );
    }
}
