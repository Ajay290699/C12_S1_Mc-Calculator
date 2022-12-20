package org.niit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator cal = null;

    @Before
    public  void setUp(){
        cal = new Calculator();
    }

    @Test
    public void addition(){
        assertEquals (30,cal.addition(10,20));
    }

    @Test
    public  void subtraction(){
        assertEquals(10,cal.subtraction(20,10));
    }

    @Test
    public void division(){
        assertEquals(5,cal.division(25,5));
    }

    @Test
    public void multiplication(){
        assertEquals(10,cal.multiplication(2,5));
    }


    @After
    public void tearDown(){
        cal = null;
    }
}
