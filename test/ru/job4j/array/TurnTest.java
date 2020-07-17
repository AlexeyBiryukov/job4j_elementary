package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenNextTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {2, 4, 6, 8};
        int[] result = turner.back(input);
        int[] expect = new int[] {8, 6, 4, 2};
        assertThat(result, is(expect));
    }

    @Test
    public void whenNextTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = turner.back(input);
        int[] expect = new int[] {7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}