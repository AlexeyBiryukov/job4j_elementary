package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void sort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void secondSort() {
        int[] input = new int[] {7, 15, 12};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {7, 12, 15};
        assertThat(result, is(expect));
    }
}