package web.service;
import org.springframework.stereotype.Component;
import web.carmodel.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> cars;
    {

        cars = new ArrayList<>();
        cars.add(new Car("RangeRover", "White", 517));
        cars.add(new Car("Mercedes", "Black", 273));
        cars.add(new Car("BMW", "Grey", 664));
        cars.add(new Car("Porsche", "Red", 491));
        cars.add(new Car("Lada", "Purple", 909));
    }
    public List<Car> getCarsCount(int count) {

        return  cars.stream().limit(count).collect(Collectors.toList());
    }
}
