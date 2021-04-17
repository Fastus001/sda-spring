
package pl.fastus.sdaspring.rest.currency.domain.dto;

import lombok.Data;

import javax.annotation.Generated;
import java.util.List;

@Data
@Generated("jsonschema2pojo")
public class ExchangeRate {

    private String table;
    private String currency;
    private String code;
    private List<Rate> rates = null;
}
