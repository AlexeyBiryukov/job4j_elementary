package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2ThenAll() {
        int result = Max.max(1, 1);
        assertThat(result, is(result));
    }

    @Test
    public void whenMax1To2To3Then() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }


    @Test
    public void whenMax1To2To3To4Then() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}