package pl.fastus.sdaspring.rest.car.services;

import pl.fastus.sdaspring.rest.car.domain.dto.CreateCarRequest;
import pl.fastus.sdaspring.rest.car.domain.dto.UpdateCarRequest;
import pl.fastus.sdaspring.rest.car.domain.Car;

import java.util.List;

/**
 * Created by Tom - 11.04.2021
 */
public interface CarService {

    void addCar(CreateCarRequest request);

    void addCars(List<Car> cars);

    List<Car> getAllCars();

    Car getCar(Long id);

    void updateCar(UpdateCarRequest request);

    void deleteCarById(Long id);
}
