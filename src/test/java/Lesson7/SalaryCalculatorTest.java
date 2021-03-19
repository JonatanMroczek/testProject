package Lesson7;

import Lesson7.ExternalService.BaseSalaryService;
import Lesson7.ExternalService.SaturdayBonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class SalaryCalculatorTest {


    @Test
    void shouldVerifyCalculateSalaryInteractionWithExternalService() {
        //given
        double saturdayBonus = 50;
        double baseSalary = 6000;
        SaturdayBonusService mockedSaturdayBonusService = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService mockedBaseSalaryService = Mockito.mock(BaseSalaryService.class);
        when(mockedSaturdayBonusService.getSaturdayBonus()).thenReturn(saturdayBonus);
        when(mockedBaseSalaryService.getBaseSalary()).thenReturn(baseSalary);
        SalaryCalculator salaryCalculator = new SalaryCalculator(mockedSaturdayBonusService, mockedBaseSalaryService);

        //when
        double calculatedSalary = salaryCalculator.calculateSalary(200, 3);

        //then
        Assertions.assertEquals(6350, calculatedSalary);

    }

    @Test
    void shouldVerifyCalculateSalaryInteractionWithExternalService2() {
        //given
        double saturdayBonus = 0;
        double baseSalary = 6000;
        SaturdayBonusService mockedSaturdayBonusService = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService mockedBaseSalaryService = Mockito.mock(BaseSalaryService.class);
        when(mockedSaturdayBonusService.getSaturdayBonus()).thenReturn(saturdayBonus);
        when(mockedBaseSalaryService.getBaseSalary()).thenReturn(baseSalary);
        SalaryCalculator salaryCalculator = new SalaryCalculator(mockedSaturdayBonusService, mockedBaseSalaryService);

        //when
        double calculatedSalary = salaryCalculator.calculateSalary(200, 3);

        //then
        Assertions.assertEquals(6200, calculatedSalary);

    }

    @Test
    void shouldThrowIllegalArgumentException() {
        //given
        double bonus = 10;
        int saturdays = -20;
        double saturdayBonus = 0;
        double baseSalary = 6000;
        SaturdayBonusService mockedSaturdayBonusService = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService mockedBaseSalaryService = Mockito.mock(BaseSalaryService.class);
        when(mockedSaturdayBonusService.getSaturdayBonus()).thenReturn(saturdayBonus);
        when(mockedBaseSalaryService.getBaseSalary()).thenReturn(baseSalary);
        SalaryCalculator salaryCalculator = new SalaryCalculator(mockedSaturdayBonusService, mockedBaseSalaryService);
        //when
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            salaryCalculator.calculateSalary(bonus, saturdays);
        });

        //then
        String expectedMessage = "Bonus and saturdays can not be negative numbers";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void shouldThrowIllegalArgumentException1() {
        //given
        double bonus = 10;
        int saturdays = 6;
        double saturdayBonus = 0;
        double baseSalary = 6000;
        SaturdayBonusService mockedSaturdayBonusService = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService mockedBaseSalaryService = Mockito.mock(BaseSalaryService.class);
        when(mockedSaturdayBonusService.getSaturdayBonus()).thenReturn(saturdayBonus);
        when(mockedBaseSalaryService.getBaseSalary()).thenReturn(baseSalary);
        SalaryCalculator salaryCalculator = new SalaryCalculator(mockedSaturdayBonusService, mockedBaseSalaryService);
        //when
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            salaryCalculator.calculateSalary(bonus, saturdays);
        });

        //then
        String expectedMessage = "Bonus and saturdays can not be negative numbers";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}