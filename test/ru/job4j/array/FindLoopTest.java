package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int input[] = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6Then6() {
        int input[] = {5, 4, 3, 2, 1, 0};
        int value = 0;
        int result = FindLoop.indexOf(input, value);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3Then2() {
        int input[] = {9, 2, 3};
        int value = 3;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
}