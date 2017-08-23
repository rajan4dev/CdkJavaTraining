package com.example;

import com.example.exception.InvalidValueException;
import org.junit.After;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorServiceTest {

    CalculatorService calculatorService = null ;

    @Before
    public void init(){
        calculatorService = new CalculatorService();
        System.out.println("Inside init()");
    }

    @After
    public void clean(){
        calculatorService = null;
        System.out.println("Inside clean()");
    }


    @Test(expected = InvalidValueException.class)
    public void testDivideForException() throws InvalidValueException{
         calculatorService.divide(20,-10);
    }


    @Test
    public void testDivide(){
        try {
            assertEquals(10,calculatorService.divide(20,2));
        } catch (InvalidValueException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testNegativeDiff(){
        //CalculatorService calculatorService = new CalculatorService();
        int rs = calculatorService.diff(-100,20);
        assertEquals(-120,rs);
    }

    @Test
    public void testDiff(){
        //CalculatorService calculatorService = new CalculatorService();
        int rs = calculatorService.diff(20,2);
        //Assert.assertEquals(18,rs);
        assertEquals(18,rs);
    }


    @Test
    public void testNegativeSum(){
        //CalculatorService calculatorService = new CalculatorService();
        int rs = calculatorService.sum(-10,20);
        assertEquals(10,rs);
    }

    @Test
    public void testSum(){
        //CalculatorService calculatorService = new CalculatorService();
        int rs = calculatorService.sum(2,2);
        assertEquals(4,rs);
    }


    @Test(timeout = 4000)
    public void testSumForSLA(){
        calculatorService.sum(2,2);
    }
}
