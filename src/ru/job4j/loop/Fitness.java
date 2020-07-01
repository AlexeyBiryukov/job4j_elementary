package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            month++;
            ivan *= 3;
            nik *= 2;
        }
        System.out.println(month);
        return month;
    }

    public static void main(String[] args) {
        calc(95, 90);
        calc(90, 95);
        calc(50, 90);
    }
}
