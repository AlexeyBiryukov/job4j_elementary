package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumma() {
        int result = Counter.sum(2, 10);
        assertThat(result, is(54));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEvent(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int rsl = Counter.sumByEvent(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
}