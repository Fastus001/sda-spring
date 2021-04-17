package pl.fastus.sdaspring.rest.currency.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.fastus.sdaspring.rest.currency.domain.dto.CurrencyRequest;
import pl.fastus.sdaspring.rest.currency.domain.dto.ExchangeRate;
import pl.fastus.sdaspring.rest.currency.services.RatesService;

/**
 * Created by Tom - 17.04.2021
 */
@RestController
@RequestMapping("/api/rates")
public class CurrencyController {

    private final RatesService ratesService;

    public CurrencyController(RatesService ratesService) {
        this.ratesService = ratesService;
    }

    @GetMapping("/{cur}")
    public ExchangeRate getExchangeRate(@PathVariable("cur") String currency) {
        if(currency.length()!=3){
            throw new IllegalArgumentException("The currency should have three letters!! for example EUR");
        }
        //można by jeszcze zrobić listę poprawnych wartości walut i sprawdzać ze stringiem
        return ratesService.getExchangeRate(currency);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ExchangeRate postCurrency(@RequestBody @Validated CurrencyRequest currency, BindingResult result){
        if(result.hasErrors()){
            throw new IllegalArgumentException("The currency should have three letters!! for example EUR");
        }
        return ratesService.getExchangeRate(currency.getCurrency());
    }



}
