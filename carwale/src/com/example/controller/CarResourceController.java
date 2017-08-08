package com.example.controller;

import com.example.dao.CarDAO;
import com.example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.APPLICATION_XML_VALUE;
import static org.springframework.util.MimeTypeUtils.TEXT_PLAIN_VALUE;

@RestController
public class CarResourceController {

    @Autowired
    CarDAO carDAO;


    @RequestMapping(value = "car", produces = TEXT_PLAIN_VALUE, method = RequestMethod.GET)
    public String readCar() {
        return "vin-100, model-Q7,make-Audi, price=80000";
    }

    @RequestMapping(value = "car", produces = APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public Car readCarAsXml() {
        // return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>80000</price></car>";
        Car car = carDAO.getByVin(1000);
        return car;
    }


   /* @RequestMapping(value = "car", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarAsJson() {
        Car car = carDAO.getByVin(1000);
        return car;
    }*/


    @RequestMapping(value = "car/{pathVar}", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarAsJson(@PathVariable("pathVar") Integer vin) {
        System.out.println("VIN to be GET is: " + vin);
        Car car = carDAO.getByVin(vin);
        return car;
    }

    @RequestMapping(value = "car/add", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public Car addCarAsJson(@RequestBody Car car) {
        return carDAO.addCar(car);
    }

    /*@RequestMapping(value = "car", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String readCarAsJson(){
        return "{\"vin\":100, \"vin\":\"model\",\"Q7\":\"model\", \"make\":\"Audi\",\"price\":80000,\"price\":\"car\"}";
    }*/
}
