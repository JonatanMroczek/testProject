package Lesson7;

import Lesson7.ExternalService.BaseSalaryService;
import Lesson7.ExternalService.SaturdayBonusService;

public class SalaryCalculator {
    private final SaturdayBonusService saturdayBonusService;
    private final BaseSalaryService baseSalaryService;

    public SalaryCalculator(SaturdayBonusService saturdayBonusService, BaseSalaryService baseSalaryService) {
        this.saturdayBonusService = saturdayBonusService;
        this.baseSalaryService = baseSalaryService;
    }

    public double calculateSalary(double bonus, int saturdays) {
        if (bonus < 0 || saturdays < 0 || saturdays > 5)
            throw new IllegalArgumentException("Bonus and saturdays can not be negative numbers");
        double saturdayBonus = saturdayBonusService.getSaturdayBonus();
        double baseSalary = baseSalaryService.getBaseSalary();
        double salary = baseSalary + bonus + saturdayBonus * saturdays;
        return salary;

    }
}

