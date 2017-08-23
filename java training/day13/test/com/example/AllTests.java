package com.example;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorServiceTest.class,PayrollServiceTest.class})
public class AllTests {
}
