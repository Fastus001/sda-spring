package pl.fastus.sdaspring.rest.currency.services;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;
import pl.fastus.sdaspring.rest.currency.domain.dto.ExchangeRate;

/**
 * Created by Tom - 17.04.2021
 */
@Service
public class RatesServiceImpl implements RatesService {

    @Override
    public ExchangeRate getExchangeRate(String param) {
        return WebClient.create("http://api.nbp.pl/api/exchangerates/rates/c/"+param)
                .get()
                .uri(UriBuilder::build)
                .accept(MediaType.APPLICATION_JSON)
                .exchangeToMono(response->response.bodyToMono(ExchangeRate.class))
                .block();
    }
}
