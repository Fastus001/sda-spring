
package pl.fastus.sdaspring.rest.currency.domain.dto;

import lombok.Data;

import javax.annotation.Generated;

@Data
@Generated("jsonschema2pojo")
public class Rate {

    private String no;
    private String effectiveDate;
    private Double bid;
    private Double ask;
}
