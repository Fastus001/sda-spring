package pl.fastus.sdaspring.rest.currency.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by Tom - 17.04.2021
 */
@Getter
@Setter
@NoArgsConstructor
public class CurrencyRequest {

    @Pattern(regexp = "^[A-Za-z]{3}$", message = "Invalid input!")
    @NotNull
    private String currency;
}
