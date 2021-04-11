package pl.fastus.sdaspring.rest.car.services;

import org.springframework.stereotype.Service;
import pl.fastus.sdaspring.rest.car.domain.dto.CreateCarRequest;
import pl.fastus.sdaspring.rest.car.domain.dto.UpdateCarRequest;
import pl.fastus.sdaspring.rest.car.domain.Car;
import pl.fastus.sdaspring.rest.car.repositories.CarRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Tom - 11.04.2021
 */
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void addCar(CreateCarRequest request) {
        final Car carToSave = new Car();
        carToSave.setMake(request.getMake());
        carToSave.setModel(request.getModel());
        carToSave.setYear(request.getYear());
        carToSave.setMileage(request.getMileage());
        carRepository.save(carToSave);
    }

    @Override
    public void addCars(List<Car> cars) {
        carRepository.saveAll(cars);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCar(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public void updateCar(UpdateCarRequest request) {
        final Optional<Car> optionalCar = carRepository.findById(request.getId());
        if(optionalCar.isEmpty()){
            throw new IllegalArgumentException("No item with given ID!");
        }
        final Car car = optionalCar.get();
        car.setMileage(request.getMileage());
        carRepository.save(car);
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }
}
