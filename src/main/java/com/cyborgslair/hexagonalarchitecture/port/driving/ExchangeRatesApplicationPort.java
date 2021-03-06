package com.cyborgslair.hexagonalarchitecture.port.driving;

import java.util.Date;
import java.util.Set;

public interface ExchangeRatesApplicationPort {
    Set<String> loadAvailableCurrencies();
    double getCurrencyExchangeRatesForDate(String currencyCode, Date date);
}
