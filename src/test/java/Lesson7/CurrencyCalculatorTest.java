package Lesson7;

import Lesson7.ExternalService.CurrencyCalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class CurrencyCalculatorTest {


    @Test
    void shouldVerifyInteractionWithExternalService4EuroBuyRate() {
        // given
        double euroBuyRate = 4.58;
        int amount = 100;
        CurrencyCalculatorService mockedService = Mockito.mock(CurrencyCalculatorService.class);
        when(mockedService.getBuyRate(Currency.EURO)).thenReturn(euroBuyRate);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(mockedService);


        // when
        double calculatedCurrency = currencyCalculator.calculateBuy(amount, Currency.EURO);

        //then
        Assertions.assertEquals(euroBuyRate * amount, calculatedCurrency);

    }

    @Test
    void shouldVerifyInteractionWithExternalService4EuroSellRate() {
        // given
        double euroSellRate = 4.62;
        int amount = 89600;
        CurrencyCalculatorService mockedService = Mockito.mock(CurrencyCalculatorService.class);
        when(mockedService.getSellRate(Currency.EURO)).thenReturn(euroSellRate);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(mockedService);


        // when
        double calculatedCurrency = currencyCalculator.calculateSell(amount, Currency.EURO);

        //then
        Assertions.assertEquals(euroSellRate * amount, calculatedCurrency);

    }

    @Test
    void shouldVerifyInteractionWithExternalService4DollarBuyRate() {
        // given
        double dollarBuyRate = 3.86;
        int amount = 12500;
        CurrencyCalculatorService mockedService = Mockito.mock(CurrencyCalculatorService.class);
        when(mockedService.getBuyRate(Currency.DOLLAR)).thenReturn(dollarBuyRate);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(mockedService);


        // when
        double calculatedCurrency = currencyCalculator.calculateBuy(amount, Currency.DOLLAR);

        //then
        Assertions.assertEquals(dollarBuyRate * amount, calculatedCurrency);

    }

    @Test
    void shouldVerifyInteractionWithExternalService4DollarSellRate() {
        // given
        double dollarSellRate = 3.89;
        int amount = 300;
        CurrencyCalculatorService mockedService = Mockito.mock(CurrencyCalculatorService.class);
        when(mockedService.getSellRate(Currency.DOLLAR)).thenReturn(dollarSellRate);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(mockedService);


        // when
        double calculatedCurrency = currencyCalculator.calculateSell(amount, Currency.DOLLAR);

        //then
        Assertions.assertEquals(dollarSellRate * amount, calculatedCurrency);

    }

    @Test
    void shouldVerifyInteractionWithExternalService4PoundBuyRate() {
        // given
        double poundBuyRate = 5.33;
        int amount = 1220;
        CurrencyCalculatorService mockedService = Mockito.mock(CurrencyCalculatorService.class);
        when(mockedService.getBuyRate(Currency.POUND)).thenReturn(poundBuyRate);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(mockedService);


        // when
        double calculatedCurrency = currencyCalculator.calculateBuy(amount, Currency.POUND);

        //then
        Assertions.assertEquals(poundBuyRate * amount, calculatedCurrency);

    }

    @Test
    void shouldVerifyInteractionWithExternalService4PoundSellRate() {
        // given
        double poundSellRate = 5.33;
        int amount = 1220;
        CurrencyCalculatorService mockedService = Mockito.mock(CurrencyCalculatorService.class);
        when(mockedService.getSellRate(Currency.POUND)).thenReturn(poundSellRate);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(mockedService);


        // when
        double calculatedCurrency = currencyCalculator.calculateSell(amount, Currency.POUND);

        //then
        Assertions.assertEquals(poundSellRate * amount, calculatedCurrency);


    }
}
