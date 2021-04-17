package pl.fastus.sdaspring.rest.car.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.fastus.sdaspring.rest.car.domain.Car;
import pl.fastus.sdaspring.rest.car.domain.dto.CreateCarRequest;
import pl.fastus.sdaspring.rest.car.domain.dto.UpdateCarRequest;
import pl.fastus.sdaspring.rest.car.services.CarService;

import java.util.List;

/**
 * Created by Tom - 11.04.2021
 */
@RequiredArgsConstructor
@Controller
@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    @GetMapping
    public @ResponseBody List<Car> getCars() {
        return carService.getAllCars();
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody Car getCar(@PathVariable Long id){
        return carService.getCar(id);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCar(@RequestBody CreateCarRequest carRequest){
        System.out.println("car = " + carRequest);
        carService.addCar(carRequest);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT) /*when there is not body response*/
    public void updateCar(@RequestBody UpdateCarRequest request){
        System.out.println("request = " + request);
        carService.updateCar(request);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id){
        carService.deleteCarById(id);
    }
}
