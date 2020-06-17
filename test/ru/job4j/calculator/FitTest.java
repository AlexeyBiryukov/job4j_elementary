package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManThenHgt() {
       int in = 187;
       int expected = 100;
       int out = (int) Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanThenHgt() {
       int in = 100;
       int expected = 80;
       int out = (int) Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}