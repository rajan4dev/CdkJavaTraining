package org.rajan;

import org.junit.Assert;
import org.junit.Test;
import org.rajan.PrimeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bhirudr on 7/17/2017.
 */
public class PrimeTest {
    @Test
    public void checkNumber2(){
        List<Integer> expectedOutput = new ArrayList<>();// Arrays.asList(2);
        expectedOutput.add(2);
        Assert.assertEquals("expected output should be a list of 2", expectedOutput, PrimeNumber.generate(2));
    }

    @Test
    public void checkNumber3(){
        List<Integer> expectedOutput =  Arrays.asList(2, 3);
        Assert.assertEquals("expected output should be a list of 2 and 3", expectedOutput, PrimeNumber.generate(3));
    }

}
