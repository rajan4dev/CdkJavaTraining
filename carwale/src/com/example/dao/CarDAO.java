package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarDAO {

    public Car selectByVin(int vin){
        return new Car(1000,"X5","BLACK","BMW",1000000,1);
    }
}
