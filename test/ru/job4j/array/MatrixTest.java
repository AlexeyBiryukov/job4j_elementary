package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when2on2() {
        int[][] table = Matrix.multiple(2);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expected));
    }

    @Test
    public void when10on10() {
        int[][] table = Matrix.multiple(5);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
    }
}