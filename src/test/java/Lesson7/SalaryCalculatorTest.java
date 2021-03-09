package Lesson7;

import Lesson7.ExternalService.BaseSalaryService;
import Lesson7.ExternalService.SaturdayBonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class SalaryCalculatorTest {

    Employee employee = new Employee();

    @Test
    void shouldVerifyCalculateSalaryInteractionWithExternalService() {
        //given
        double saturdayBonus = 50;
        double baseSalary = 6000;
        SaturdayBonusService mockedService = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService mockedService1 = Mockito.mock(BaseSalaryService.class);
        when(mockedService.getSaturdayBonus(employee)).thenReturn(saturdayBonus);
        when(mockedService1.getBaseSalary(employee)).thenReturn(baseSalary);
        SalaryCalculator salaryCalculator = new SalaryCalculator(mockedService, mockedService1);

        //when
        double calculatedSalary = salaryCalculator.calculateSalary(employee, 200, 3);

        //then
        Assertions.assertEquals(6350, calculatedSalary);

    }

    @Test
    void shouldVerifyCalculateSalaryInteractionWithExternalService2() {
        //given
        double saturdayBonus = 0;
        double baseSalary = 6000;
        SaturdayBonusService mockedService = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService mockedService1 = Mockito.mock(BaseSalaryService.class);
        when(mockedService.getSaturdayBonus(employee)).thenReturn(saturdayBonus);
        when(mockedService1.getBaseSalary(employee)).thenReturn(baseSalary);
        SalaryCalculator salaryCalculator = new SalaryCalculator(mockedService, mockedService1);

        //when
        double calculatedSalary = salaryCalculator.calculateSalary(employee, 200, 3);

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
        SaturdayBonusService mockedService = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService mockedService1 = Mockito.mock(BaseSalaryService.class);
        when(mockedService.getSaturdayBonus(employee)).thenReturn(saturdayBonus);
        when(mockedService1.getBaseSalary(employee)).thenReturn(baseSalary);
        SalaryCalculator salaryCalculator = new SalaryCalculator(mockedService, mockedService1);
        //when
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            salaryCalculator.calculateSalary(employee, bonus, saturdays);
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
        SaturdayBonusService mockedService = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService mockedService1 = Mockito.mock(BaseSalaryService.class);
        when(mockedService.getSaturdayBonus(employee)).thenReturn(saturdayBonus);
        when(mockedService1.getBaseSalary(employee)).thenReturn(baseSalary);
        SalaryCalculator salaryCalculator = new SalaryCalculator(mockedService, mockedService1);
        //when
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            salaryCalculator.calculateSalary(employee, bonus, saturdays);
        });

        //then
        String expectedMessage = "Bonus and saturdays can not be negative numbers";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}