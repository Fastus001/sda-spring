package pl.fastus.sdaspring.rest.car.domain.dto;

import lombok.Value;

/**
 * Created by Tom - 11.04.2021
 */
@Value
public class UpdateCarRequest {

    Long id;
    Integer mileage;
}
