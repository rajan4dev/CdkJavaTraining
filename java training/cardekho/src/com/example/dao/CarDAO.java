package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CarDAO {

    Map<Integer,Car> cars = null;

    @PostConstruct
    public void init(){
        cars = new HashMap<Integer, Car>();
        cars.put(1000,new Car(1000,"X5","BMW",4500000.00,5));
        cars.put(2000,new Car(2000,"X2","BMW",7500000.00,5));
        cars.put(3000,new Car(3000,"A1","Audi",300000.00,5));
        cars.put(4000,new Car(4000,"Q7","Audi",10000000.00,5));
        cars.put(5000,new Car(5000,"XE","Jaguar",89900000.00,5));
    }

    @PreDestroy
    public void clean(){
        cars.clear();
        cars = null;
    }

    public int update(int vin,Car car){
        cars.put(vin,car);
        return vin;
    }

    public int save(Car car){
        int id = (cars.size()*1000)+1000;
        car.setVin(id);
        cars.put(id,car);
        return id;
    }

    public Car selectByVin(Integer vin){
        //JDBC logic
        //return  new Car(1000,"X5","BMW",4500000.00,5);
        return  cars.get(vin);
    }

    public Collection<Car> selectAll(){
        return  cars.values();
    }

    public void delete(int vin) {
        cars.remove(vin);
    }
}
