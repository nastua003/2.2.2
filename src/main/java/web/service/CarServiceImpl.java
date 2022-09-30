package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "BMW", "111"));
        cars.add(new Car(2, "Mersedes", "222"));
        cars.add(new Car(3, "Audi", "333"));
        cars.add(new Car(4, "Volva", "444"));
        cars.add(new Car(5, "Lada", "555"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
