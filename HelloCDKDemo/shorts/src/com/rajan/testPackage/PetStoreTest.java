package com.rajan.testPackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bhirudr on 7/21/2017.
 */
public class PetStoreTest {

    private final int a = 2;
    //must be public not static

    @Test
    public void testSomething() {
        int addExact = getAddExact(a, 20);
        System.out.println(addExact);

    }

    private int getAddExact(int a, int b) {
        return a + b;
    }
}
