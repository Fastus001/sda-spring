package pl.fastus.sdaspring.rest.car.domain.dto;

import lombok.Value;

/**
 * Created by Tom - 11.04.2021
 */
@Value
public class CreateCarRequest {

    String make;
    String model;
    Integer year;
    Integer mileage;
}
