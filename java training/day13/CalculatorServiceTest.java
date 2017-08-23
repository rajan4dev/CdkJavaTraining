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


    @Test
    public void testNegativeDiff(){
        int rs = calculatorService.diff(-100,20);
        assertEquals(-120,rs);
    }

    @Test
    public void testDiff(){
        int rs = calculatorService.diff(20,2);
        assertEquals(18,rs);
    }


    @Test
    public void testNegativeSum(){
        int rs = calculatorService.sum(-10,20);
        assertEquals(10,rs);
    }

    @Test
    public void testSum(){
        int rs = calculatorService.sum(2,2);
        assertEquals(4,rs);
    }


    @Test(timeout = 4000)
    public void testSumForSLA(){
        calculatorService.sum(2,2);
    }
}
