package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest  {

    int a,b;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before ");
        a = 2;
        b = 0;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After ");
    }

    @Test
    public void add() {
        Calculator c = new Calculator();
        System.out.println("Test add ");
        int res = 2;
        Assert.assertEquals("2 + 0 = 2 - проверим ..." , res, c.add(a,b));
    }

    @Test
    public void div() {
        Calculator c = new Calculator();
        System.out.println("Test div ");
        double res = 1;
        try {
            Assert.assertEquals(" 2 / 2", res, c.div(a, b), 0.001);
        } catch (Exception ex) {

        }
    }

    @Test(timeout = 1000)
    public  void Ex(){
        System.out.println("Test div ex ");
        try {
            Calculator c = new Calculator();
            double res = c.div(2,0);
            System.out.println("Test div = " + res);
        } catch (Exception ex) {
            System.out.println("Test div ex error ");
            Assert.assertEquals("", ex.getMessage());
        }
    }

    @Test(expected = Exception.class)
    public  void ExMast() throws Exception {
        System.out.println("Test div ex ");
        throw new Exception("Hello");
    }
}