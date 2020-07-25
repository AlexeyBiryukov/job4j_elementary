package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6Then6() {
        int[] input = {5, 4, 3, 2, 1, 0};
        int value = 0;
        int result = FindLoop.indexOf(input, value);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] input = {9, 2, 3};
        int value = 3;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind8() {
        int[] input = new int[] {1, 2, 3, 4, 8, 15, 10, 91};
        int value = 2;
        int start = 0;
        int finish = 1;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind10() {
        int[] input = new int[] {1, 2, 3, 4, 8, 15, 101, 22, 33, 44, 81, 125, 110};
        int value = 33;
        int start = 4;
        int finish = 10;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 7;
        assertThat(result, is(expect));
    }
}