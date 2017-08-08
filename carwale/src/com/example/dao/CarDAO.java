package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CarDAO {
    Map<Integer, Car> cars;

    @PostConstruct
    public void init() {
        cars = new HashMap<>();
        cars.put(100, new Car(100, "ns200", "pulsar", "Bajaj", 100000, 2));
        cars.put(200, new Car(200, "rs200", "pulsar", "Bajaj", 200000, 9));
        cars.put(300, new Car(300, "q7", "Audi", "Audi", 4500000, 3));
        cars.put(400, new Car(400, "a7", "Audi", "Audi", 9570000, 2));
        cars.put(500, new Car(500, "X5", "BLACK", "BMW", 1000000, 1));

    }

    public Car getByVin(Integer vin) {
        return cars.get(vin);
    }

    public Car addCar(Car car) {
        Car addedCar = cars.put((cars.size() * 100) + 100, car);
        System.out.println("Added Car :" + addedCar.getModel() + "Vin: " + addedCar.getVin());
        return addedCar;
    }

    @PreDestroy
    public void clean() {
        cars.clear();
        cars = null;
    }
}
