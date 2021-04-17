package pl.fastus.sdaspring.rest.currency.services;

import pl.fastus.sdaspring.rest.currency.domain.dto.ExchangeRate;

/**
 * Created by Tom - 17.04.2021
 */
public interface RatesService {

    ExchangeRate getExchangeRate(String param);
}
