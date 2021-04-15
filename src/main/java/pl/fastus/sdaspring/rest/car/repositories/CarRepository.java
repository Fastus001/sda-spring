package pl.fastus.sdaspring.rest.car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.fastus.sdaspring.rest.car.domain.Car;

/**
 * Created by Tom - 11.04.2021
 */
public interface CarRepository  extends JpaRepository<Car, Long> {

}
