package Lesson7;

import Lesson7.ExternalService.CurrencyCalculatorService;

public class CurrencyCalculator {

    CurrencyCalculatorService service;

    public CurrencyCalculator(CurrencyCalculatorService currencyCalculatorService) {
        this.service = currencyCalculatorService;
    }

    public double calculateExchangeRate(double amount, Currency fromCurrency, Currency toCurrency) {
        double exchangeRate = service.getExchangeRate(fromCurrency, toCurrency);
        return exchangeRate * amount;
    }
}

