package pl.fastus.sdaspring.rest.car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.fastus.sdaspring.rest.car.domain.Car;

/**
 * Created by Tom - 11.04.2021
 */
public interface CarRepository  extends JpaRepository<Car, Long> {

//    public void addCar(CreateCarRequest request){
//        final Long max = carList.stream()
//                .map(Car::getId)
//                .max(Long::compareTo)
//                .orElse(0L);
//
//        final int distance = request.getMileage() != null ? request.getMileage() : 0;
//
//        carList.add(Car.of(max +1,
//                request.getMake(),
//                request.getModel(),
//                request.getYear(),
//                distance));
//    }
//
//    public void addCars(List<Car> cars){
//        carList.addAll(cars);
//    }
//
//    public List<Car> getAllCars() {
//        return carList;
//    }
//
//    public Car getCar(Long id) {
//        return carList.stream()
//                .filter(car -> car.getId().equals(id))
//                .findFirst()
//                .orElse(null);
//    }
//
//    public void updateCar(UpdateCarRequest request) {
//        carList.stream()
//                .filter(car -> car.getId().equals(request.getId()))
//                .forEach(car -> car.setMileage(request.getMileage()));
//    }
//
//    public void deleteCarById(Long id) {
//        final Car car = getCar(id);
//        carList.remove(car);
//    }
}
