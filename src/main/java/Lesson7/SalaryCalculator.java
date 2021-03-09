package Lesson7;

import Lesson7.ExternalService.BaseSalaryService;
import Lesson7.ExternalService.SaturdayBonusService;

public class SalaryCalculator {
    SaturdayBonusService service;
    BaseSalaryService service1;

    public SalaryCalculator(SaturdayBonusService saturdayBonusService, BaseSalaryService baseSalaryService) {
        this.service = saturdayBonusService;
        this.service1 = baseSalaryService;
    }

    public double calculateSalary(Employee employee, double bonus, int saturdays) {
        if (bonus < 0 || saturdays < 0 || saturdays > 5)
            throw new IllegalArgumentException("Bonus and saturdays can not be negative numbers");
        double saturdayBonus = service.getSaturdayBonus(employee);
        double baseSalary = service1.getBaseSalary(employee);
        double salary = baseSalary + bonus + saturdayBonus * saturdays;
        return salary;

    }
}

