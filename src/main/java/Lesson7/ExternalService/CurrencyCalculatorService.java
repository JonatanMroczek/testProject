package Lesson7.ExternalService;

import Lesson7.Currency;

public interface CurrencyCalculatorService {
    double getSellRate(Currency currency);

    double getBuyRate(Currency currency);
}
