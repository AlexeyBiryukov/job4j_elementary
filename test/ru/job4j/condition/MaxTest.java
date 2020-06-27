package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then1() {
        int result = Max.max1(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max1(1, 2);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax1To2ThenAll() {
        int result = Max.max1(1, 1);
        assertThat(result, is(result));
    }
}