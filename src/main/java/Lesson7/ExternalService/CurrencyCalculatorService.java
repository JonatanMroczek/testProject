package Lesson7.ExternalService;

import Lesson7.Currency;

public interface CurrencyCalculatorService {
    double getExchangeRate(Currency fromCurrency, Currency toCurrency);
}
