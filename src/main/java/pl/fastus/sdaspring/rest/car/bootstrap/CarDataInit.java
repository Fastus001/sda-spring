package pl.fastus.sdaspring.rest.car.bootstrap;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
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
@Profile("dev")
@Slf4j
public class CarDataInit {

    private final CarService carService;

    @PostConstruct
    public void addCars(){
        final List<Car> carsList = createCarsList();
        carService.addCars(carsList);
        log.info("sample data initialized!");
    }

    private List<Car> createCarsList(){
        List<Car> cars = new ArrayList<>();

        final Car car = new Car();
        car.setModel("Toyota");
        car.setMake("Corolla");
        car.setYear(2000);
        car.setMileage(125000);
        cars.add(car);

        return cars;
    }
}
