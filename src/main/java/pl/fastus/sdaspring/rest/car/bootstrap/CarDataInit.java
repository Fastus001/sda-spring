package pl.fastus.sdaspring.rest.car.bootstrap;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.fastus.sdaspring.rest.car.domain.Car;
import pl.fastus.sdaspring.rest.car.services.CarService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom - 11.04.2021
 */
@RequiredArgsConstructor
@Component
public class CarDataInit {

    private final CarService carService;

    @PostConstruct
    public void addCars(){
        final List<Car> carsList = createCarsList();
        final Car car = new Car();
        car.setModel("Toyota");
        car.setMake("Corolla");
        car.setYear(2000);
        car.setMileage(125000);
        carsList.add(car);

        carService.addCars(carsList);
    }

    private List<Car> createCarsList(){
        return new ArrayList<>();
    }
}
