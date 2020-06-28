package com.cyborgslair.hexagonalarchitecture.adapter.driving;


import com.cyborgslair.hexagonalarchitecture.domain.ExchangeRatesService;
import com.cyborgslair.hexagonalarchitecture.port.driving.ExchangeRatesApplicationPort;

import java.util.Date;
import java.util.Set;

//  this specific driving port implementation is just calling service methods in this case
public class ExchangeRatesApplicationAdapter implements ExchangeRatesApplicationPort {

    private ExchangeRatesService exchangeRatesService;

    public ExchangeRatesApplicationAdapter() {
        this.exchangeRatesService = new ExchangeRatesService();
    }

    @Override
    public Set<String> loadAvailableCurrencies() {
        return exchangeRatesService.loadAvailableCurrencies();
    }

    @Override
    public double getCurrencyExchangeRatesForDate(String currencyCode, Date date) {
        return exchangeRatesService.getCurrencyExchangeRatesForDate(currencyCode, date);
    }
}
