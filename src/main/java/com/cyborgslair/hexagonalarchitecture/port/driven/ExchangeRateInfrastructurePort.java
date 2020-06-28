package com.cyborgslair.hexagonalarchitecture.port.driven;

import com.cyborgslair.hexagonalarchitecture.domain.ExchangeRate;

import java.util.List;

public interface ExchangeRateInfrastructurePort {
    List<ExchangeRate> loadExchangeRates();
}
