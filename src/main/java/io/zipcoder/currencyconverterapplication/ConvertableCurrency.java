package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    CurrencyType getType();
    default Double convert(CurrencyType currencyType) {

        return currencyType.getRate() / this.getType().getRate();
    }
}
