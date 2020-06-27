package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean rsl = ((ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac));
        return false;
    }

    public static boolean existTrue(double ab, double ac, double bc) {
        boolean rsl1 = ((ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac));
        return true;
    }

    public static void main(String[] args) {
        exist(2.0, 2.0, 2.0);

        existTrue(2.0, 2.0, 2.0);
    }
}
