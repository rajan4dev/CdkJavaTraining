package com.example;

import com.example.exception.InvalidValueException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayrollServiceTest {

    PayrollService payrollService = null ;

    @Before
    public void init(){
        payrollService = new PayrollService();
    }

    @After
    public void clean(){
        payrollService = null;
    }


    @Test
    public void testHra(){
        assertEquals(3600.00,payrollService.hra(12000.00),2);
    }

}
