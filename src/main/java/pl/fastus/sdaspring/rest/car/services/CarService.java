package pl.fastus.sdaspring.rest.car.services;

import pl.fastus.sdaspring.rest.car.domain.Car;
import pl.fastus.sdaspring.rest.car.domain.dto.CreateCarRequest;
import pl.fastus.sdaspring.rest.car.domain.dto.UpdateCarRequest;

import java.util.List;

/**
 * Created by Tom - 11.04.2021
 */
public interface CarService {

    Car addCar(CreateCarRequest request);

    void addCars(List<Car> cars);

    List<Car> getAllCars();

    Car getCar(Long id);

    void updateCar(Long id, UpdateCarRequest request);

    void deleteCarById(Long id);
}
