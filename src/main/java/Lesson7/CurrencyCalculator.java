package Lesson7;

import Lesson7.ExternalService.CurrencyCalculatorService;

public class CurrencyCalculator {
    CurrencyCalculatorService calculatorService;
    CurrencyCalculatorService service;

    public CurrencyCalculator(CurrencyCalculatorService currencyCalculatorService) {
        this.service = currencyCalculatorService;
    }

    public double calculateBuy(double amount, Currency currency) {
        double BuyRate = service.getBuyRate(currency);
        return BuyRate * amount;
    }

    public double calculateSell(double amount, Currency currency) {
        double SellRate = service.getSellRate(currency);
        return SellRate * amount;


    }
}
