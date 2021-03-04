package Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DivisibilityBy2Test {
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7,9})
    void ShouldVerifyIsNotDivisibileBy2(int value) {
        // given, when
        boolean isDivisibleBy2 = DivisibilityBy2.isDivisibileBy2(value);

        // then
        Assertions.assertEquals(false, isDivisibleBy2);

    }
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8,10})
    void ShouldVerifyIsDivisibileBy2(int value) {
        // given, when
        boolean isDivisibleBy2 = DivisibilityBy2.isDivisibileBy2(value);

        // then
        Assertions.assertEquals(true, isDivisibleBy2);

    }
}