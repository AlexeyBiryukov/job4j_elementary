package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstmax() {
        int result = MultiMax.max(10, 2, 6);
        assertThat(result, is(result));
    }

    @Test
    public void whenSecondmax() {
        int result = MultiMax.max(5, 25, 7);
        assertThat(result, is(result));
    }

    @Test
    public void whenThirdmax() {
        int result = MultiMax.max(10, 12, 15);
        assertThat(result, is(result));
    }

    @Test
    public void whenAnyNumbmax() {
        int result = MultiMax.max(10, 10, 10);
        assertThat(result, is(result));
    }
}