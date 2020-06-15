package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        double first = (x2 - x1);
        double second = (y2 - y1);

        first = Math.pow(first,2);
        second = Math.pow(second,2);

        double rsl = first + second;
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result1 = Point.distance(3, 4, 5, 6);
        System.out.println("result # 1 (0, 0) to (2, 0) " + result1);

        double result2 = Point.distance(5, 4, 10, 8);
        System.out.println("result # 2 (0, 0) to (2, 0) " + result2);

    }
}

