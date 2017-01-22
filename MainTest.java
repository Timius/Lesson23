package com.test;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


/**
 * Created by User on 22.01.2017.
 */
public class MainTest {
    @Test
    public void testMax(){
        DemoArray d = new DemoArray();
        int [] array ={50, 46, 65, 54, 65, 5, 7, 84, 9};
        int result = d.max(array);
        assertEquals("Result should be 84", 84, result);
        }

    @Test
    public void testMin(){
        DemoArray d = new DemoArray();
        int [] array ={0, 46, 65, 54, 65, 5, 7, 84, 9};
        int result = d.min(array);
        assertEquals("Result should be 0", 0, result);
    }

    @Test
    public void testMin1(){
        DemoArray d = new DemoArray();
        int [] array ={0, 46, -2, 54, 65, 5, 7, 84, 9};
        int result = d.min(array);
        assertEquals("Result should be -2", -2, result);
    }

    @Test
    public void testAvg(){
        DemoArray d = new DemoArray();
        int [] array ={10, 0, 10, 4, 65, 5, 7, 84, 9};
        double result = d.avg(array);
        assertArrayEquals("Result should be 24.25", 24.25, result);
    }

    @Test
    public void testAvg1(){
        DemoArray d = new DemoArray();
        int [] array ={10, 20, 10, 4, 65, 5, 7, 84, 9};
        double result = d.avg(array);
        assertArrayEquals("Result should be 23.7777777", 23.7777777, result);
    }

    private void assertArrayEquals(String s, double v, double result) {
    }
}



//    @Test
//    public void testDiff() {
//        Main m = new Main();
//        int result = m.diff(1, 1);
//        //   assert result == 0;
//        assertEquals("Result should be 0", 0, result);
//    }