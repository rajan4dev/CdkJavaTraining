package com.example;

import com.example.exception.InvalidValueException;

import java.util.concurrent.TimeUnit;

public class CalculatorService {

    public int divide(int valOne,int valTwo) throws InvalidValueException{
        if(valOne <= 0 || valTwo <= 0){
            throw new InvalidValueException("Value can not be zero or negative!!!");
        }
        return  valOne/valTwo;
    }

    public int diff(int valOne,int valTwo){
        return  valOne-valTwo;
    }

    public int sum(int valOne,int valTwo){
       //DB call
        /*try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return  valOne+valTwo;
    }
}
