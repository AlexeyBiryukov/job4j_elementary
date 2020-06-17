package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenPointThenDis1() {
        int in1 = 0;
        int in2 = 0;
        int in3 = 2;
        int in4 = 0;
        int expected = 2;
        int out = (int) Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenPointThenDis2() {
        int in1 = 3;
        int in2 = 4;
        int in3 = 5;
        int in4 = 6;
        int expected = 2;
        int out = (int) Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenPointThenDis3() {
        int in1 = 5;
        int in2 = 4;
        int in3 = 10;
        int in4 = 8;
        int expected = 6;
        int out = (int) Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out);

    }
}