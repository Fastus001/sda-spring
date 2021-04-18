package pl.fastus.sdaspring.rest.car.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Tom - 11.04.2021
 */
@Setter
@Getter
@NoArgsConstructor
public class UpdateCarRequest {

    private Integer mileage;
}
