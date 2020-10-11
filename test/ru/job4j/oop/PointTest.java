package ru.job4j.oop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        double result = one.distance(two);
        double expected = 2.0;
        assertThat(result, is(expected));
    }

    @Test
    public void distance3d() {
        Point one = new Point(2, 2, 4);
        Point two = new Point(2, 2, 10);
        double result = one.distance3d(two);
        double expected = 6.0;
        assertThat(result, is(expected));
    }
}