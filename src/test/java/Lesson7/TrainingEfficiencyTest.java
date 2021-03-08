package Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TrainingEfficiencyTest {
    @ParameterizedTest
    @MethodSource("provideArgumentsForTrainingEfficiencyCalculator")
    void verifyTrainingEfficiencyCalculator(int trainingTime, int caloriesBurned, int averagePulse, double trainingEfficiencyScore) {
        Assertions.assertEquals(trainingEfficiencyScore, TrainingEfficiency.trainingEfficiencyCalculator(trainingTime, caloriesBurned, averagePulse));
    }

    private static Stream<Arguments> provideArgumentsForTrainingEfficiencyCalculator() {
        return Stream.of(
                Arguments.of(20, 301, 160, 1.83),
                Arguments.of(60, 600, 120, 2.83),
                Arguments.of(60, 350, 165, 2.0));
    }

    @ParameterizedTest
    @MethodSource("provideIntsForTrainingEfficiencyCalculator")
    void shouldThrowIllegalArgumentException(int trainingTime, int caloriesBurned, int averagePulse) {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            TrainingEfficiency.trainingEfficiencyCalculator(trainingTime, caloriesBurned, averagePulse);
        });

        String expectedMessage = ("Arguments can not be negative");
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    private static Stream<Arguments> provideIntsForTrainingEfficiencyCalculator() {
        return Stream.of(
                Arguments.of(-1, 301, 160),
                Arguments.of(60, -600, 120),
                Arguments.of(60, 350, -165));
    }


    @ParameterizedTest
    @CsvSource(value = {"1.1:Low training efficiency", "1.8:Good training efficiency", "2.3:Very good training efficiency", "3:Excellent training efficiency"}, delimiter = ':')
    void verifyTrainingEfficiency(double trainingEfficiencyScore, String expected) {
        String trainingEfficiency = TrainingEfficiency.trainingEfficiency(trainingEfficiencyScore);
        Assertions.assertEquals(expected, trainingEfficiency);
    }

}

