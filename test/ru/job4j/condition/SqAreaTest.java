package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenSQThenAre1() {
        int in1 = 4;
        int in2 = 1;
        int expected = 1;
        int out = (int) SqArea.square(in1, in2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSQThenAre2() {
        int in1 = 6;
        int in2 = 2;
        int expected = 2;
        int out = (int) SqArea.square(in1, in2);
        Assert.assertEquals(expected, out);
    }
}